package defpackage;

import android.text.BidiFormatter;
import com.google.android.apps.adm.R;
import com.google.android.apps.adm.integrations.spot.ringing.RingerService;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwb implements lsh {
    private final /* synthetic */ int a;

    public dwb(int i) {
        this.a = i;
    }

    public static BidiFormatter b() {
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        bidiFormatter.getClass();
        return bidiFormatter;
    }

    public static kpb c() {
        kpb a = kpb.a();
        a.getClass();
        return a;
    }

    public static final bym d() {
        return new bym(c());
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                jzd z = ivc.z(Executors.newScheduledThreadPool(2));
                z.getClass();
                return z;
            case 1:
                return new duz();
            case 2:
                return b();
            case 3:
                throw null;
            case 4:
                jzd z2 = ivc.z(Executors.newScheduledThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors() - 2)));
                z2.getClass();
                return z2;
            case 5:
                dyb dybVar = new dyb();
                dybVar.a = "main";
                dybVar.c(R.string.notification_channel_name_main);
                dybVar.b(R.string.notification_channel_main_description);
                dybVar.b = 5;
                return dybVar.a();
            case 6:
                FirebaseMessaging a = FirebaseMessaging.a();
                a.getClass();
                return a;
            case 7:
                throw null;
            case 8:
                return new ede();
            case 9:
                return new edt();
            case 10:
                return new edw();
            case 11:
                return new eef();
            case 12:
                return new eet();
            case 13:
                return new ekm(1);
            case 14:
                return new efk();
            case 15:
                return new ejw();
            case 16:
                return new ekm(0);
            case 17:
                return new eks();
            case 18:
                return bym.A();
            case 19:
                return RingerService.class;
            default:
                dyb dybVar2 = new dyb();
                dybVar2.a = "spot-findmydevice-lostdevice";
                dybVar2.c(R.string.spot_lost_device_channel);
                dybVar2.b(R.string.spot_lost_device_channel_description);
                dybVar2.b = 6;
                return dybVar2.a();
        }
    }
}
