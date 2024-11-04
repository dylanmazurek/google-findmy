package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ksd implements fxr {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ksd(FirebaseInstanceId firebaseInstanceId, String str, String str2, int i) {
        this.d = i;
        this.b = firebaseInstanceId;
        this.c = str;
        this.a = str2;
    }

    @Override // defpackage.fxr
    public final fxs a(Object obj) {
        if (this.d != 0) {
            FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) this.b;
            kqs kqsVar = firebaseInstanceId.d;
            String str = (String) obj;
            kpb kpbVar = FirebaseInstanceId.g;
            String f = firebaseInstanceId.f();
            String str2 = this.a;
            kpbVar.f(f, (String) this.c, str2, str, kqsVar.c());
            return fma.o(new ktd(str));
        }
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str3 = (String) obj;
        FirebaseMessaging.l(firebaseMessaging.e).c(firebaseMessaging.d(), this.a, str3, firebaseMessaging.i.c());
        Object obj2 = this.c;
        if (obj2 == null || !str3.equals(((ksn) obj2).b)) {
            firebaseMessaging.e(str3);
        }
        return fma.o(str3);
    }

    public /* synthetic */ ksd(FirebaseMessaging firebaseMessaging, String str, ksn ksnVar, int i) {
        this.d = i;
        this.b = firebaseMessaging;
        this.a = str;
        this.c = ksnVar;
    }
}
