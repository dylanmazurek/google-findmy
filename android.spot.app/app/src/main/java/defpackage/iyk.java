package defpackage;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyk extends iyv {
    final /* synthetic */ String a;
    final /* synthetic */ iym b;
    final /* synthetic */ bym c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyk(iym iymVar, bym bymVar, String str, bym bymVar2) {
        super(bymVar);
        this.a = str;
        this.c = bymVar2;
        this.b = iymVar;
    }

    @Override // defpackage.iyv
    protected final void a() {
        Integer num;
        try {
            iym iymVar = this.b;
            IInterface iInterface = iymVar.a.l;
            String str = iymVar.b;
            String str2 = this.a;
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("playcore.version.code", 20100);
            bundle.putAll(bundle2);
            bundle.putString("package.name", str2);
            try {
                num = Integer.valueOf(iymVar.c.getPackageManager().getPackageInfo(iymVar.c.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                iym.d.i("The current version of the app could not be retrieved", new Object[0]);
                num = null;
            }
            if (num != null) {
                bundle.putInt("app.version.code", num.intValue());
            }
            iyl iylVar = new iyl(this.b, this.c);
            Parcel a = ((duf) iInterface).a();
            a.writeString(str);
            duh.c(a, bundle);
            duh.d(a, iylVar);
            ((duf) iInterface).d(2, a);
        } catch (RemoteException e) {
            iym.d.j(e, "requestUpdateInfo(%s)", this.a);
            this.c.t(new RuntimeException(e));
        }
    }
}
