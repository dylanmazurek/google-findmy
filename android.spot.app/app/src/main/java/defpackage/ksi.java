package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksi implements Closeable {
    public final URL a;
    public volatile Future b;
    public fxs c;

    private ksi(URL url) {
        this.a = url;
    }

    public static ksi a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ksi(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: ".concat(String.valueOf(str)));
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.cancel(true);
    }
}
