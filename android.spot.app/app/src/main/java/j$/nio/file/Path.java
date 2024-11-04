package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface Path extends Comparable<Path>, Iterable<Path> {
    boolean C(Path path);

    Path G(Path path);

    K H(M m, H... hArr);

    Path P(Path path);

    boolean endsWith(String str);

    boolean equals(Object obj);

    Path getFileName();

    AbstractC0026i getFileSystem();

    Path getName(int i);

    int getNameCount();

    Path getParent();

    Path getRoot();

    boolean isAbsolute();

    Iterator iterator();

    K m(M m, H[] hArr, I... iArr);

    Path normalize();

    Path o(Path path);

    Path p(EnumC0030m... enumC0030mArr);

    Path resolve(String str);

    Path resolveSibling(String str);

    boolean startsWith(String str);

    Path subpath(int i, int i2);

    int t(Path path);

    Path toAbsolutePath();

    File toFile();

    String toString();

    URI toUri();

    boolean y(Path path);
}
