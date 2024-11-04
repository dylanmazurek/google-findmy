package defpackage;

import com.google.android.apps.adm.firebase.FmdFirebaseMessagingService;
import com.google.firebase.messaging.FirebaseMessagingService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ebi extends FirebaseMessagingService implements lsc {
    private volatile lru a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            FmdFirebaseMessagingService fmdFirebaseMessagingService = (FmdFirebaseMessagingService) this;
            dwi dwiVar = (dwi) r();
            fmdFirebaseMessagingService.a = lsg.b(dwiVar.a.x);
            fmdFirebaseMessagingService.b = (ewc) dwiVar.a.h.a();
            dwj dwjVar = dwiVar.a;
            fmdFirebaseMessagingService.c = new ddg(dwjVar.aS.b, (byte[]) null);
            fmdFirebaseMessagingService.d = new hri((fma) dwjVar.d.a(), (gph) dwjVar.T.a(), new gwc());
        }
        super.onCreate();
    }

    @Override // defpackage.lsc
    public final Object r() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new lru(this);
                }
            }
        }
        return this.a.r();
    }
}
