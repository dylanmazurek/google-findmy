package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebg {
    public static final jnk a = jnk.l("com/google/android/apps/adm/firebase/FirebaseMessagingInitializerImpl");
    public final FirebaseMessaging b;
    public final Executor c;
    public final ewc d;

    public ebg(FirebaseMessaging firebaseMessaging, ewc ewcVar, Executor executor) {
        this.b = firebaseMessaging;
        this.d = ewcVar;
        this.c = executor;
    }
}
