package j$.desugar.sun.nio.fs;

import j$.nio.file.attribute.B;
import j$.nio.file.attribute.InterfaceC0011i;

/* loaded from: classes2.dex */
final class c implements InterfaceC0011i {
    private final B a;
    private final B b;
    private final B c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final long h;
    private final Integer i;

    public c(B b, B b2, B b3, boolean z, boolean z2, boolean z3, boolean z4, long j, Integer num) {
        this.a = b;
        this.b = b2;
        this.c = b3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = j;
        this.i = num;
    }

    @Override // j$.nio.file.attribute.InterfaceC0011i
    public final B creationTime() {
        return this.c;
    }

    @Override // j$.nio.file.attribute.InterfaceC0011i
    public final Object fileKey() {
        return this.i;
    }

    @Override // j$.nio.file.attribute.InterfaceC0011i
    public final boolean isDirectory() {
        return this.e;
    }

    @Override // j$.nio.file.attribute.InterfaceC0011i
    public final boolean isOther() {
        return this.g;
    }

    @Override // j$.nio.file.attribute.InterfaceC0011i
    public final boolean isRegularFile() {
        return this.d;
    }

    @Override // j$.nio.file.attribute.InterfaceC0011i
    public final boolean isSymbolicLink() {
        return this.f;
    }

    @Override // j$.nio.file.attribute.InterfaceC0011i
    public final B lastAccessTime() {
        return this.b;
    }

    @Override // j$.nio.file.attribute.InterfaceC0011i
    public final B lastModifiedTime() {
        return this.a;
    }

    @Override // j$.nio.file.attribute.InterfaceC0011i
    public final long size() {
        return this.h;
    }
}
