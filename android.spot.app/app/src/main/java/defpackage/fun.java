package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.uwb.internal.GetRangingCapabilitiesParams;
import com.google.android.gms.nearby.uwb.internal.IsAvailableParams;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fun implements fju {
    private final /* synthetic */ int a;

    public /* synthetic */ fun(int i) {
        this.a = i;
    }

    @Override // defpackage.fju
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                fty ftyVar = (fty) ((fum) obj).v();
                IsAvailableParams isAvailableParams = new IsAvailableParams();
                isAvailableParams.a = new ftw((bym) obj2);
                Parcel a = ftyVar.a();
                duh.c(a, isAvailableParams);
                ftyVar.d(1001, a);
                return;
            case 1:
                fpz fpzVar = new fpz((bym) obj2);
                fqm fqmVar = (fqm) ((fqn) obj).v();
                Parcel a2 = fqmVar.a();
                duh.d(a2, fpzVar);
                fqmVar.c(3, a2);
                return;
            case 2:
                fty ftyVar2 = (fty) ((fum) obj).v();
                GetRangingCapabilitiesParams getRangingCapabilitiesParams = new GetRangingCapabilitiesParams();
                getRangingCapabilitiesParams.a = new fua((bym) obj2);
                Parcel a3 = ftyVar2.a();
                duh.c(a3, getRangingCapabilitiesParams);
                ftyVar2.d(1002, a3);
                return;
            case 3:
                ((bym) obj2).s(null);
                return;
            case 4:
                fvj fvjVar = (fvj) ((fvh) obj).v();
                fvn fvnVar = new fvn((bym) obj2);
                Parcel a4 = fvjVar.a();
                duh.d(a4, fvnVar);
                fvjVar.c(224704, a4);
                return;
            case 5:
                try {
                    fvj fvjVar2 = (fvj) ((fvh) obj).v();
                    fvl fvlVar = new fvl((bym) obj2);
                    Parcel a5 = fvjVar2.a();
                    duh.d(a5, fvlVar);
                    fvjVar2.c(224702, a5);
                    return;
                } catch (RemoteException e) {
                    ((bym) obj2).t(e);
                    return;
                }
            case 6:
                fwp fwpVar = (fwp) ((fwq) obj).v();
                fen fenVar = new fen((bym) obj2, 15, (boolean[]) null);
                Parcel a6 = fwpVar.a();
                duh.d(a6, fenVar);
                fwpVar.c(27, a6);
                return;
            case 7:
                int i = fwn.a;
                return;
            case 8:
                fww fwwVar = (fww) ((fwx) obj).v();
                fwu fwuVar = new fwu((bym) obj2);
                Parcel a7 = fwwVar.a();
                duh.d(a7, fwuVar);
                fwwVar.d(1, a7);
                return;
            default:
                fxz fxzVar = new fxz((bym) obj2);
                fyi fyiVar = (fyi) ((fym) obj).v();
                Parcel a8 = fyiVar.a();
                duh.d(a8, fxzVar);
                fyiVar.c(2, a8);
                return;
        }
    }
}
