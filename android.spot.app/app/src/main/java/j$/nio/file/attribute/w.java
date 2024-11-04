package j$.nio.file.attribute;

import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFilePermission;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class w {
    public static /* bridge */ /* synthetic */ PosixFilePermission A() {
        return PosixFilePermission.GROUP_EXECUTE;
    }

    public static /* bridge */ /* synthetic */ PosixFilePermission B() {
        return PosixFilePermission.OTHERS_READ;
    }

    public static /* bridge */ /* synthetic */ PosixFilePermission C() {
        return PosixFilePermission.OTHERS_WRITE;
    }

    public static /* bridge */ /* synthetic */ PosixFilePermission D() {
        return PosixFilePermission.OTHERS_EXECUTE;
    }

    public static /* bridge */ /* synthetic */ AclFileAttributeView j(Object obj) {
        return (AclFileAttributeView) obj;
    }

    public static /* bridge */ /* synthetic */ GroupPrincipal m(Object obj) {
        return (GroupPrincipal) obj;
    }

    public static /* bridge */ /* synthetic */ PosixFilePermission n() {
        return PosixFilePermission.OWNER_READ;
    }

    public static /* bridge */ /* synthetic */ boolean s(Object obj) {
        return obj instanceof AclFileAttributeView;
    }

    public static /* bridge */ /* synthetic */ PosixFilePermission v() {
        return PosixFilePermission.OWNER_WRITE;
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof GroupPrincipal;
    }

    public static /* bridge */ /* synthetic */ PosixFilePermission x() {
        return PosixFilePermission.OWNER_EXECUTE;
    }

    public static /* bridge */ /* synthetic */ PosixFilePermission y() {
        return PosixFilePermission.GROUP_READ;
    }

    public static /* bridge */ /* synthetic */ PosixFilePermission z() {
        return PosixFilePermission.GROUP_WRITE;
    }
}
