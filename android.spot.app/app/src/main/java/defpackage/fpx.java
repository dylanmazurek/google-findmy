package defpackage;

import android.os.Parcel;
import com.google.android.gms.nearby.fastpair.internal.RenameDeviceParams;
import com.google.android.gms.nearby.uwb.internal.StopRangingParams;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fpx implements fju {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fpx(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [android.os.IInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.os.IInterface, java.lang.Object] */
    @Override // defpackage.fju
    public final void a(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                fpz fpzVar = new fpz((bym) obj2);
                fqm fqmVar = (fqm) ((fqn) obj).v();
                String packageName = ((fhq) this.a).b.getPackageName();
                Parcel a = fqmVar.a();
                duh.d(a, fpzVar);
                a.writeString(packageName);
                duh.d(a, this.b);
                fqmVar.c(1, a);
                return;
            case 1:
                fpz fpzVar2 = new fpz((bym) obj2);
                fqm fqmVar2 = (fqm) ((fqn) obj).v();
                Parcel a2 = fqmVar2.a();
                duh.d(a2, fpzVar2);
                a2.writeString((String) this.b);
                a2.writeString((String) this.a);
                fqmVar2.c(4, a2);
                return;
            case 2:
                fqh fqhVar = new fqh((bym) obj2);
                fqm fqmVar3 = (fqm) ((fqn) obj).v();
                String packageName2 = ((fhq) this.a).b.getPackageName();
                Parcel a3 = fqmVar3.a();
                duh.d(a3, fqhVar);
                a3.writeString(packageName2);
                duh.d(a3, this.b);
                fqmVar3.c(7, a3);
                return;
            case 3:
                fen fenVar = new fen((bym) obj2, 13, (int[]) null);
                fsj fsjVar = (fsj) ((fsm) obj).v();
                Parcel a4 = fsjVar.a();
                duh.d(a4, fenVar);
                duh.c(a4, this.a);
                duh.c(a4, this.b);
                fsjVar.c(1, a4);
                return;
            case 4:
                ftj ftjVar = (ftj) ((ftd) obj).v();
                RenameDeviceParams renameDeviceParams = new RenameDeviceParams();
                renameDeviceParams.a = ((ftc) this.b).a();
                renameDeviceParams.b = (String) this.a;
                renameDeviceParams.c = new fth((bym) obj2);
                Parcel a5 = ftjVar.a();
                duh.c(a5, renameDeviceParams);
                ftjVar.d(17, a5);
                return;
            case 5:
                fty ftyVar = (fty) ((fum) obj).v();
                StopRangingParams stopRangingParams = new StopRangingParams();
                stopRangingParams.a = new fug((bym) obj2);
                Parcel a6 = ftyVar.a();
                duh.c(a6, stopRangingParams);
                ftyVar.d(1006, a6);
                fjm aX = fma.aX(this.b, ftp.class.getName());
                Object obj3 = this.a;
                ((fhq) obj3).g(aX, 1305);
                ((fuu) obj3).a = null;
                return;
            case 6:
                fwo fwoVar = new fwo((bym) obj2, 0);
                fwp fwpVar = (fwp) ((fwq) obj).v();
                Parcel a7 = fwpVar.a();
                duh.d(a7, fwoVar);
                a7.writeString((String) this.b);
                a7.writeString((String) this.a);
                a7.writeString(null);
                fwpVar.c(11, a7);
                return;
            case 7:
                fwp fwpVar2 = (fwp) ((fwq) obj).v();
                fen fenVar2 = new fen((fjo) this.b, 14, (char[]) null);
                Parcel a8 = fwpVar2.a();
                a8.writeString((String) this.a);
                duh.d(a8, fenVar2);
                fwpVar2.c(28, a8);
                return;
            default:
                fwo fwoVar2 = new fwo((bym) obj2, 0);
                ((fwp) ((fwq) obj).v()).e(fwoVar2, "CURRENT:" + ((String) this.a) + ":" + ((String) this.b));
                return;
        }
    }

    public /* synthetic */ fpx(Object obj, String str, int i) {
        this.c = i;
        this.b = obj;
        this.a = str;
    }

    public /* synthetic */ fpx(String str, int i) {
        this.c = i;
        this.b = str;
        this.a = "";
    }
}
