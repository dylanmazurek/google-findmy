package defpackage;

import android.content.Context;
import com.google.android.apps.adm.integrations.spot.ringing.RingerService;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class esg extends eiq implements lsc {
    private volatile lru d;
    private final Object e = new Object();
    private boolean f = false;

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.f) {
            this.f = true;
            RingerService ringerService = (RingerService) this;
            dwi dwiVar = (dwi) r();
            dwj dwjVar = dwiVar.a;
            ringerService.f = new ktn(dwjVar.s, dwjVar.Q, dwjVar.aQ, dwjVar.d);
            ringerService.d = (Context) dwiVar.a.aS.b;
        }
        super.onCreate();
    }

    @Override // defpackage.lsc
    public final Object r() {
        if (this.d == null) {
            synchronized (this.e) {
                if (this.d == null) {
                    this.d = new lru(this);
                }
            }
        }
        return this.d.r();
    }
}
