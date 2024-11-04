package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kse implements fxo {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kse(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.fxo
    public final void d(Object obj) {
        if (this.b != 0) {
            if (((nbw) obj).a == 2) {
                dwo dwoVar = (dwo) this.a;
                if (!dwoVar.c) {
                    dwoVar.c = true;
                    ((jni) ((jni) dwo.a.d()).j("com/google/android/apps/adm/appupdate/AppUpdateHelperImpl", "lambda$maybeShowAppUpdateBottomSheet$0", 44, "AppUpdateHelperImpl.java")).r("App update found, showing dialog.");
                    new ebk().cs(((aj) dwoVar.b).a(), ebk.class.getSimpleName());
                    return;
                }
                return;
            }
            return;
        }
        kst kstVar = (kst) obj;
        if (((FirebaseMessaging) this.a).i() && kstVar.d.a() != null && !kstVar.e()) {
            kstVar.d(0L);
        }
    }
}
