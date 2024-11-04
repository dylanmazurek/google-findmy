package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knh {
    public static final Object a = new Object();
    public static final Map b = new rx();
    public final koa c;
    public final koh e;
    public final kqz f;
    private final Context h;
    private final String i;
    private final knl j;
    public final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicBoolean k = new AtomicBoolean();
    public final List g = new CopyOnWriteArrayList();

    protected knh(Context context, String str, knl knlVar) {
        List arrayList;
        int i;
        new CopyOnWriteArrayList();
        fma.aR(context);
        this.h = context;
        fma.aP(str);
        this.i = str;
        this.j = knlVar;
        knm knmVar = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class.toString() + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            } else {
                arrayList2.add(new knz((String) it.next(), 1));
            }
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        koy koyVar = koy.a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        kne.h(new FirebaseCommonRegistrar(), arrayList3);
        kne.h(new ExecutorsRegistrar(), arrayList3);
        kne.g(knu.e(context, Context.class, new Class[0]), arrayList4);
        kne.g(knu.e(this, knh.class, new Class[0]), arrayList4);
        kne.g(knu.e(knlVar, knl.class, new Class[0]), arrayList4);
        ktk ktkVar = new ktk();
        if (bpx.h(context) && FirebaseInitProvider.b.get()) {
            kne.g(knu.e(knmVar, knm.class, new Class[0]), arrayList4);
        }
        koa koaVar = new koa(koyVar, arrayList3, arrayList4, ktkVar);
        this.c = koaVar;
        Trace.endSection();
        this.e = new koh(new kny(this, context, i));
        this.f = kne.j(koaVar, kqh.class);
        njz njzVar = new njz(this);
        h();
        if (this.d.get() && fin.a.c()) {
            njzVar.f(true);
        }
        this.g.add(njzVar);
        Trace.endSection();
    }

    public static knh b() {
        knh knhVar;
        synchronized (a) {
            knhVar = (knh) b.get("[DEFAULT]");
            if (knhVar != null) {
                ((kqh) knhVar.f.a()).c();
            } else {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + flz.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return knhVar;
    }

    public static knh c(Context context, knl knlVar, String str) {
        knh knhVar;
        AtomicReference atomicReference = knf.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (knf.a.get() == null) {
                knf knfVar = new knf();
                if (a.q(knf.a, knfVar)) {
                    fin.b(application);
                    fin.a.a(knfVar);
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (a) {
            Map map = b;
            fma.aO(!map.containsKey(trim), a.ag(trim, "FirebaseApp name ", " already exists!"));
            fma.aS(context, "Application context cannot be null.");
            knhVar = new knh(context, trim, knlVar);
            map.put(trim, knhVar);
        }
        knhVar.i();
        return knhVar;
    }

    public final Context a() {
        h();
        return this.h;
    }

    public final knl d() {
        h();
        return this.j;
    }

    public final Object e(Class cls) {
        h();
        return kne.l(this.c, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof knh)) {
            return false;
        }
        return this.i.equals(((knh) obj).f());
    }

    public final String f() {
        h();
        return this.i;
    }

    public final String g() {
        return fma.B(f().getBytes(Charset.defaultCharset())) + "+" + fma.B(d().b.getBytes(Charset.defaultCharset()));
    }

    public final void h() {
        fma.aO(!this.k.get(), "FirebaseApp was deleted");
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final void i() {
        HashMap hashMap;
        if (!bpx.h(this.h)) {
            f();
            Context context = this.h;
            if (kng.a.get() == null) {
                kng kngVar = new kng(context);
                if (a.q(kng.a, kngVar)) {
                    context.registerReceiver(kngVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        f();
        koa koaVar = this.c;
        if (a.q(koaVar.b, Boolean.valueOf(j()))) {
            synchronized (koaVar) {
                hashMap = new HashMap(koaVar.a);
            }
            koaVar.f(hashMap);
        }
        ((kqh) this.f.a()).c();
    }

    public final boolean j() {
        return "[DEFAULT]".equals(f());
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        fma.aV("name", this.i, arrayList);
        fma.aV("options", this.j, arrayList);
        return fma.aU(arrayList, this);
    }
}
