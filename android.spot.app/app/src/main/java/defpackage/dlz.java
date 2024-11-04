package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlz implements dlx {
    int a;
    public Bitmap.Config b;
    private final dma c;

    public dlz(dma dmaVar) {
        this.c = dmaVar;
    }

    @Override // defpackage.dlx
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dlz) {
            dlz dlzVar = (dlz) obj;
            if (this.a == dlzVar.a && amr.i(this.b, dlzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = this.a * 31;
        Bitmap.Config config = this.b;
        if (config != null) {
            i = config.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final String toString() {
        return dmb.a(this.a, this.b);
    }
}
