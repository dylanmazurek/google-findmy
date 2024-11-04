package defpackage;

import android.os.Binder;
import android.os.IBinder;
import com.google.android.apps.adm.integrations.spot.ringing.RingerService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esi extends Binder implements IBinder {
    final /* synthetic */ RingerService a;

    public esi(RingerService ringerService) {
        this.a = ringerService;
    }
}
