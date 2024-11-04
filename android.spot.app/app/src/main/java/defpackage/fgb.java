package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fgb implements fxm {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fgb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v20, types: [java.util.concurrent.ScheduledFuture, java.lang.Object] */
    @Override // defpackage.fxm
    public final void a(fxs fxsVar) {
        switch (this.b) {
            case 0:
                ((CountDownLatch) this.a).countDown();
                return;
            case 1:
                boolean i = fxsVar.i();
                Object obj = this.a;
                if (!i) {
                    ((jni) ((jni) ((jni) ebg.a.f()).i(fxsVar.d())).j("com/google/android/apps/adm/firebase/FirebaseMessagingInitializerImpl", "lambda$registerWithFcm$0", '%', "FirebaseMessagingInitializerImpl.java")).r("Failed to register with FCM");
                    ewc ewcVar = ((ebg) obj).d;
                    ewcVar.m = 3;
                    ewcVar.d = null;
                    return;
                }
                ((jni) ((jni) ebg.a.e()).j("com/google/android/apps/adm/firebase/FirebaseMessagingInitializerImpl", "lambda$registerWithFcm$0", 41, "FirebaseMessagingInitializerImpl.java")).r("Successfully registered with FCM");
                ewc ewcVar2 = ((ebg) obj).d;
                String str = (String) fxsVar.e();
                hwx.K(!TextUtils.isEmpty(str), "gcmRegistrationId cannot be empty");
                ewcVar2.m = 2;
                ewcVar2.d = str;
                ewcVar2.p.i();
                return;
            case 2:
                Object obj2 = this.a;
                synchronized (((ksr) obj2).b) {
                    if (((fxs) ((ksr) obj2).c).h() && !((fxs) ((ksr) obj2).c).i()) {
                        ((ksr) obj2).g();
                    }
                }
                return;
            case 3:
                boolean z = ((fxv) fxsVar).c;
                Object obj3 = this.a;
                if (z) {
                    ((jwq) obj3).cancel(false);
                    return;
                }
                if (fxsVar.i()) {
                    ((gam) obj3).d(fxsVar.e());
                    return;
                } else {
                    Exception d = fxsVar.d();
                    if (d != null) {
                        ((jwq) obj3).n(d);
                        return;
                    }
                    throw new IllegalStateException();
                }
            case 4:
                kpb kpbVar = FirebaseInstanceId.g;
                ((CountDownLatch) this.a).countDown();
                return;
            case 5:
                ksw.b((Intent) this.a);
                return;
            case 6:
                ((kuv) this.a).f();
                return;
            default:
                this.a.cancel(false);
                return;
        }
    }
}
