package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jpx extends jow {
    private final String a;

    /* JADX INFO: Access modifiers changed from: protected */
    public jpx(String str) {
        this.a = str;
    }

    @Override // defpackage.jow
    public String a() {
        return this.a;
    }

    @Override // defpackage.jow
    public void b(RuntimeException runtimeException, jov jovVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
