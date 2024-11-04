package defpackage;

import android.app.Activity;
import android.app.Application;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lri implements lsc {
    protected final Activity a;
    public final lsc b;
    private volatile Object c;
    private final Object d = new Object();

    public lri(Activity activity) {
        this.a = activity;
        this.b = new lrn((oc) activity);
    }

    @Override // defpackage.lsc
    public final Object r() {
        String concat;
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    if (!(this.a.getApplication() instanceof lsc)) {
                        if (Application.class.equals(this.a.getApplication().getClass())) {
                            concat = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
                        } else {
                            concat = "Found: ".concat(String.valueOf(String.valueOf(this.a.getApplication().getClass())));
                        }
                        throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(concat));
                    }
                    ksr b = ((lrh) hzc.ai(this.b, lrh.class)).b();
                    b.c = this.a;
                    this.c = new dwf((dwj) b.a, (Activity) b.c);
                }
            }
        }
        return this.c;
    }
}
