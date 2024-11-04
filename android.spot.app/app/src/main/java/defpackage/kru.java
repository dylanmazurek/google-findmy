package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kru {
    public final boolean a;
    private final Object b;
    private final Object c;

    private kru(jfb jfbVar, boolean z, jeb jebVar) {
        this.c = jfbVar;
        this.a = z;
        this.b = jebVar;
    }

    public static kru f(char c) {
        return new kru(new jey(new jdt(c), 1));
    }

    public static kru g(String str) {
        boolean z;
        if (str.length() != 0) {
            z = true;
        } else {
            z = false;
        }
        hwx.K(z, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return f(str.charAt(0));
        }
        return new kru(new jey(str, 0));
    }

    public final synchronized boolean a() {
        return this.a;
    }

    public final Iterable b(CharSequence charSequence) {
        charSequence.getClass();
        return new jfa(this, charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [jfb, java.lang.Object] */
    public final Iterator c(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public final List d(CharSequence charSequence) {
        charSequence.getClass();
        Iterator c = c(charSequence);
        ArrayList arrayList = new ArrayList();
        while (c.hasNext()) {
            arrayList.add((String) c.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [jfb, java.lang.Object] */
    public final kru e() {
        return new kru(this.c, true, (jeb) this.b);
    }

    public kru(Context context, String str) {
        context = Build.VERSION.SDK_INT >= 24 ? bqx.d(context) : context;
        this.b = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:".concat(str), 0);
        this.c = sharedPreferences;
        boolean z = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                Context context2 = context;
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    Context context3 = context;
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
                    if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                        z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.a = z;
    }

    public kru(jfb jfbVar) {
        this(jfbVar, false, jdy.a);
    }
}
