package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinkRegistrar;
import com.google.firebase.iid.Registrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kox implements knw {
    private final /* synthetic */ int a;

    public /* synthetic */ kox(int i) {
        this.a = i;
    }

    @Override // defpackage.knw
    public final Object a(knv knvVar) {
        switch (this.a) {
            case 0:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.a();
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.a();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.a();
            case 3:
                return koy.a;
            case 4:
                return TransportRegistrar.lambda$getComponents$0(knvVar);
            case 5:
                return TransportRegistrar.lambda$getComponents$1(knvVar);
            case 6:
                return TransportRegistrar.lambda$getComponents$2(knvVar);
            case 7:
                return FirebaseDynamicLinkRegistrar.lambda$getComponents$0(knvVar);
            case 8:
                return Registrar.lambda$getComponents$0(knvVar);
            case 9:
                return Registrar.lambda$getComponents$1(knvVar);
            case 10:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(knvVar);
            case 11:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(knvVar);
            default:
                Set m = kne.m(knvVar, ktg.class);
                ktf ktfVar = ktf.a;
                if (ktfVar == null) {
                    synchronized (ktf.class) {
                        ktfVar = ktf.a;
                        if (ktfVar == null) {
                            ktfVar = new ktf();
                            ktf.a = ktfVar;
                        }
                    }
                }
                return new kte(m, ktfVar);
        }
    }
}
