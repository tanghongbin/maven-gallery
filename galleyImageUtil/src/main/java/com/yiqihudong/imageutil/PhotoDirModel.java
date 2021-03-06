package com.yiqihudong.imageutil;

import java.util.ArrayList;

/**
 * PhotoDirModel
 *
 * @author weiwu.song
 * @version: v1.0
 */
public class PhotoDirModel {
    //目录名
    private String dirName;
    //目录下图片路径集合
    private ArrayList<String> paths;

    public String getDirName() {
        return dirName;
    }

    public void setDirName(String dirName) {
        this.dirName = dirName;
    }

    public ArrayList<String> getPaths() {
        return paths;
    }

    public void setPaths(ArrayList<String> paths) {
        this.paths = paths;
    }

    public void addPath(String path) {
        paths.add(path);
    }
}
