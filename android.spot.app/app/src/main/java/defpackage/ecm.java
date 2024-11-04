package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecm extends ebx {
    public ehr af;
    public ksf ag;
    private boolean ah;

    @Override // defpackage.v
    public final Dialog a(Bundle bundle) {
        int i;
        cp cpVar = new cp(F());
        cpVar.j(R.string.setup_confirmation_dialog_title);
        if (true != this.ah) {
            i = R.string.setup_confirmation_dialog_message;
        } else {
            i = R.string.setup_confirmation_dialog_message_for_profile;
        }
        cpVar.d(i);
        String string = z().getString(R.string.setup_send);
        ece eceVar = new ece((v) this, 7);
        cl clVar = cpVar.a;
        clVar.h = string;
        clVar.i = eceVar;
        cpVar.g(z().getString(R.string.setup_not_now), new ece((v) this, 8));
        return cpVar.b();
    }

    @Override // defpackage.ag
    public final void ad() {
        boolean z;
        jer g = this.af.g();
        if (g.g() && (g.c() instanceof efa)) {
            efa efaVar = (efa) g.c();
            hwx.V(efaVar.h.g(), "UI not attached");
            if (efaVar.h.c() == this) {
                z = true;
            } else {
                z = false;
            }
            hwx.K(z, "detaching wrong UI");
            this.ag = null;
            efaVar.h = jdl.a;
        }
        super.ad();
    }

    @Override // defpackage.ag
    public final void af() {
        super.af();
        jer g = this.af.g();
        if (g.g() && (g.c() instanceof efa)) {
            efa efaVar = (efa) g.c();
            hwx.V(!efaVar.h.g(), "Rename device UI already attached");
            efaVar.h = jer.i(this);
            ((ecm) efaVar.h.c()).ag = efaVar.o;
        }
    }

    @Override // defpackage.v, defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.ah = A().getBoolean("is_managed_profile");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [lqz, java.lang.Object] */
    @Override // defpackage.v, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ksf ksfVar = this.ag;
        if (ksfVar != null) {
            ((bym) ksfVar.a.a()).k(dxp.DEVICES);
        }
    }
}
