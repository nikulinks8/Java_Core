package org.lessons.lesson4;

public abstract class DeciduousTree extends Tree{
    private boolean hasleaf;

    public DeciduousTree(int height, boolean hasleaf){
        super(height);
        this.hasleaf = hasleaf;
    }
}
