package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class lih extends lik {
    private static final long serialVersionUID = 1;
    private final int d;
    private final int e;

    public lih(byte[] bArr, int i, int i2) {
        super(bArr);
        p(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.lik, defpackage.lim
    public final byte a(int i) {
        x(i, this.e);
        return this.a[this.d + i];
    }

    @Override // defpackage.lik, defpackage.lim
    public final byte b(int i) {
        return this.a[this.d + i];
    }

    @Override // defpackage.lik
    protected final int c() {
        return this.d;
    }

    @Override // defpackage.lik, defpackage.lim
    public final int d() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lik, defpackage.lim
    public final void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, this.d + i, bArr, i2, i3);
    }

    Object writeReplace() {
        return new lik(A());
    }
}
