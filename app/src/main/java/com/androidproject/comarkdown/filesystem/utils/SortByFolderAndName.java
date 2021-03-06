package com.androidproject.comarkdown.filesystem.utils;

import java.io.File;
import java.util.Comparator;

/**
 * Created by wuxinying on 2017/12/8.
 */

public class SortByFolderAndName implements Comparator<File> {
    boolean first;
    boolean second;

    public SortByFolderAndName(boolean first,boolean second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compare(File lhs, File rhs) {
        if (first) {
            if (!lhs.isFile() && rhs.isFile()) {
                return -1;
            }
            if (lhs.isFile() && !rhs.isFile()) {
                return 1;
            }
        } else {
            if (!lhs.isFile() && rhs.isFile()) {
                return 1;
            }
            if (lhs.isFile() && !rhs.isFile()) {
                return -1;
            }
        }

        if (second) {
            if (!(lhs.isFile() ^ rhs.isFile())) {
                return lhs.getName().compareTo(rhs.getName());
            }
        } else {
            if (!(lhs.isFile() ^ rhs.isFile())) {
                return -lhs.getName().compareTo(rhs.getName());
            }
        }

        return 0;
    }

}
