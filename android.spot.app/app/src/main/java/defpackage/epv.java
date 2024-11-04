package defpackage;

import com.google.android.apps.adm.R;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epv implements lsh {
    private final /* synthetic */ int a;

    public epv(int i) {
        this.a = i;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        int i = 2;
        switch (this.a) {
            case 0:
                jzd z = ivc.z(Executors.newScheduledThreadPool(2));
                z.getClass();
                return z;
            case 1:
                dyb dybVar = new dyb();
                dybVar.a = "spot-findmydevice-sharing";
                dybVar.c(R.string.spot_shared_devices_channel_name);
                dybVar.b(R.string.spot_shared_devices_channel_description);
                dybVar.b = 5;
                return dybVar.a();
            case 2:
                jzd z2 = ivc.z(Executors.newScheduledThreadPool(2));
                z2.getClass();
                return z2;
            case 3:
                return new dhx((byte[]) null, (char[]) null);
            case 4:
                return new evo();
            case 5:
                return new evz();
            case 6:
                return new hpd();
            case 7:
                return new cfn(kyh.DEVICE_COMPONENT_UNSPECIFIED);
            case 8:
                return new fma();
            case 9:
                return new fma();
            case 10:
                fgp fgpVar = fgp.a;
                fgpVar.getClass();
                return fgpVar;
            case 11:
                return new fma();
            case 12:
                return new fma();
            case 13:
                return new fma();
            case 14:
                return new gdi(i);
            case 15:
                return new gdi(4);
            case 16:
                return new gdi(3);
            case 17:
                return new gdi(1);
            case 18:
                return new gdi(0);
            case 19:
                return new frx();
            default:
                String str = (String) lsr.a.a();
                str.getClass();
                return str;
        }
    }
}
