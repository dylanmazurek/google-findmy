package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eos implements DialogInterface.OnClickListener {
    public final /* synthetic */ ag a;
    private final /* synthetic */ int b;

    public /* synthetic */ eos(ag agVar, int i) {
        this.b = i;
        this.a = agVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ((eot) this.a).aF(true);
                return;
            case 1:
                ((eor) this.a).aF(false);
                return;
            case 2:
                ((eot) this.a).aF(false);
                return;
            case 3:
                ((epa) this.a).aF(true);
                return;
            case 4:
                ((epa) this.a).aF(false);
                return;
            case 5:
                etq etqVar = ((etj) this.a).d;
                etqVar.d(lnb.SHARING_APPLICATION_USER_QUIT_FROM_REQUIREMENTS);
                etqVar.f.i(etp.b(etn.TERMINATED, etk.USER_QUIT));
                return;
            case 6:
                ((etx) this.a).af.f();
                return;
            case 7:
                ((euh) this.a).d.b();
                return;
            case 8:
                ((exs) this.a).aG(true);
                return;
            case 9:
                ((exs) this.a).aG(false);
                return;
            case 10:
                ((exy) this.a).aG(true);
                return;
            default:
                ((exy) this.a).aG(false);
                return;
        }
    }
}
