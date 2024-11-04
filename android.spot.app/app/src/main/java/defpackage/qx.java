package defpackage;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class qx implements DialogInterface.OnClickListener {
    private final WeakReference a;
    private final /* synthetic */ int b;

    public qx(qy qyVar, int i, byte[] bArr) {
        this.b = i;
        this.a = new WeakReference(qyVar);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b != 0) {
            if (this.a.get() != null) {
                ((qy) this.a.get()).j(true);
            }
        } else if (this.a.get() != null) {
            ((qy) this.a.get()).k(true);
        }
    }

    public qx(qy qyVar, int i) {
        this.b = i;
        this.a = new WeakReference(qyVar);
    }
}
