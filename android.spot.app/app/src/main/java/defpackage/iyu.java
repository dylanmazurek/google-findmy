package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyu {
    public volatile boolean a;

    public iyu() {
    }

    public final void a() {
        if (!this.a) {
        } else {
            throw new IllegalStateException("Already released");
        }
    }

    public iyu(Context context) {
        new jck("AppUpdateListenerRegistry");
        new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        new HashSet();
        this.a = false;
        iqg.m(context);
    }
}
