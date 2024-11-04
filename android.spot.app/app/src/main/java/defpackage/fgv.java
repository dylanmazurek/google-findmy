package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgv extends fld {
    public final byte[] a;

    public fgv(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    @Override // defpackage.fld
    public final byte[] x() {
        return this.a;
    }
}
