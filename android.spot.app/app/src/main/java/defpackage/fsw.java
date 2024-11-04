package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.fastpair.internal.UnpairDeviceParams;
import com.google.android.gms.nearby.uwb.internal.GetLocalAddressParams;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fsw implements fju {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fsw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.fju
    public final void a(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                fta ftaVar = (fta) obj;
                bym bymVar = (bym) obj2;
                fsy fsyVar = new fsy(bymVar);
                ?? r1 = this.a;
                try {
                    fst fstVar = (fst) ftaVar.v();
                    Parcel a = fstVar.a();
                    duh.d(a, fsyVar);
                    duh.c(a, r1);
                    fstVar.c(2, a);
                    return;
                } catch (RemoteException unused) {
                    fma.ba(Status.d, null, bymVar);
                    return;
                }
            case 1:
                fta ftaVar2 = (fta) obj;
                bym bymVar2 = (bym) obj2;
                fsz fszVar = new fsz(bymVar2);
                ?? r12 = this.a;
                try {
                    fst fstVar2 = (fst) ftaVar2.v();
                    Parcel a2 = fstVar2.a();
                    duh.d(a2, fszVar);
                    duh.c(a2, r12);
                    fstVar2.c(3, a2);
                    return;
                } catch (RemoteException unused2) {
                    fma.ba(Status.d, null, bymVar2);
                    return;
                }
            case 2:
                fta ftaVar3 = (fta) obj;
                bym bymVar3 = (bym) obj2;
                fsx fsxVar = new fsx(bymVar3);
                ?? r13 = this.a;
                try {
                    fst fstVar3 = (fst) ftaVar3.v();
                    Parcel a3 = fstVar3.a();
                    duh.d(a3, fsxVar);
                    duh.c(a3, r13);
                    fstVar3.c(1, a3);
                    return;
                } catch (RemoteException unused3) {
                    fma.ba(Status.d, null, bymVar3);
                    return;
                }
            case 3:
                ftj ftjVar = (ftj) ((ftd) obj).v();
                UnpairDeviceParams unpairDeviceParams = new UnpairDeviceParams();
                unpairDeviceParams.a = ((ftc) this.a).a();
                unpairDeviceParams.b = new fth((bym) obj2);
                Parcel a4 = ftjVar.a();
                duh.c(a4, unpairDeviceParams);
                ftjVar.d(18, a4);
                return;
            case 4:
                fty ftyVar = (fty) ((fum) obj).v();
                GetLocalAddressParams getLocalAddressParams = new GetLocalAddressParams();
                getLocalAddressParams.a = new fuj((fuu) this.a, (bym) obj2);
                Parcel a5 = ftyVar.a();
                duh.c(a5, getLocalAddressParams);
                ftyVar.d(1003, a5);
                return;
            case 5:
                this.a.run();
                ((bym) obj2).s(null);
                return;
            case 6:
                ((fvs) ((fvz) obj).v()).e((fvr) this.a, true, 1);
                ((bym) obj2).s(null);
                return;
            case 7:
                ((fvs) ((fvz) obj).v()).e((fvr) this.a, false, 0);
                ((bym) obj2).s(true);
                return;
            case 8:
                fvh fvhVar = (fvh) obj;
                Object obj3 = this.a;
                try {
                    fvj fvjVar = (fvj) fvhVar.v();
                    fvo fvoVar = new fvo((Context) obj3, (bym) obj2);
                    Parcel a6 = fvjVar.a();
                    duh.d(a6, fvoVar);
                    fvjVar.c(224705, a6);
                    return;
                } catch (RemoteException e) {
                    ((bym) obj2).t(e);
                    return;
                }
            case 9:
                fvj fvjVar2 = (fvj) ((fvh) obj).v();
                fvm fvmVar = new fvm((fjo) this.a);
                Parcel a7 = fvjVar2.a();
                duh.d(a7, fvmVar);
                fvjVar2.c(224703, a7);
                return;
            case 10:
                ((fwp) ((fwq) obj).v()).e(new fwo((bym) obj2, 0), (String) this.a);
                return;
            default:
                fhq fhqVar = (fhq) this.a;
                ((fym) obj).I(((fye) fhqVar.d).b, null, new fyb(fhqVar, (bym) obj2));
                return;
        }
    }
}
