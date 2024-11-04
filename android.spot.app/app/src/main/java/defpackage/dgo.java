package defpackage;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.GeneratedAppGlideModule;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgo implements ComponentCallbacks2 {
    private static volatile dgo f;
    private static volatile boolean g;
    public final dln a;
    public final dgr b;
    public final List c = new ArrayList();
    public final dlu d;
    public final bqc e;
    private final dro h;
    private final dmf i;

    public dgo(Context context, dkt dktVar, dmf dmfVar, dln dlnVar, dlu dluVar, dro droVar, bqc bqcVar, Map map, List list, List list2, ddg ddgVar) {
        this.a = dlnVar;
        this.d = dluVar;
        this.i = dmfVar;
        this.h = droVar;
        this.e = bqcVar;
        this.b = new dgr(context, dluVar, new dgz(this, list2), new dsc(null), map, list, dktVar, ddgVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:            if (new java.util.HashSet().isEmpty() != false) goto L125;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:            r0 = new java.util.HashSet();        r5 = r14.iterator();     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:            if (r5.hasNext() == false) goto L177;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:            if (r0.contains(((com.google.android.libraries.glide.fife.module.FifeGlideModule) r5.next()).getClass()) == false) goto L179;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:            r5.remove();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.dgo b(android.content.Context r25) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgo.b(android.content.Context):dgo");
    }

    public static dhd c(Context context) {
        return f(context).b(context);
    }

    public static dhd d(View view) {
        View view2;
        dro f2 = f(view.getContext());
        if (dtq.i()) {
            return f2.b(view.getContext().getApplicationContext());
        }
        bsc.q(view);
        amr.p(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity a = dro.a(view.getContext());
        if (a == null) {
            return f2.b(view.getContext().getApplicationContext());
        }
        if (a instanceof aj) {
            aj ajVar = (aj) a;
            f2.a.clear();
            dro.d(ajVar.a().j(), f2.a);
            View findViewById = ajVar.findViewById(R.id.content);
            ag agVar = null;
            while (!view.equals(findViewById) && (agVar = (ag) f2.a.get(view)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            f2.a.clear();
            if (agVar != null) {
                amr.p(agVar.x(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
                if (dtq.i()) {
                    return f2.b(agVar.x().getApplicationContext());
                }
                if (agVar.E() != null) {
                    f2.b.a(agVar.E());
                }
                agVar.G();
                Context x = agVar.x();
                dgo b = b(x.getApplicationContext());
                ddh ddhVar = f2.c;
                cex cexVar = agVar.ad;
                boolean z = false;
                if (agVar.au() && !agVar.av() && (view2 = agVar.P) != null && view2.getWindowToken() != null && agVar.P.getVisibility() == 0) {
                    z = true;
                }
                return ddhVar.e(x, b, cexVar, z);
            }
            return f2.c(ajVar);
        }
        return f2.b(view.getContext().getApplicationContext());
    }

    private static GeneratedAppGlideModule e(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e) {
            g(e);
            return null;
        } catch (InstantiationException e2) {
            g(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            g(e3);
            return null;
        } catch (InvocationTargetException e4) {
            g(e4);
            return null;
        }
    }

    private static dro f(Context context) {
        amr.p(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).h;
    }

    private static void g(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public final Context a() {
        return this.b.getBaseContext();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        dtq.g();
        this.i.i();
        this.a.c();
        this.d.b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        dtq.g();
        synchronized (this.c) {
            for (dhd dhdVar : this.c) {
            }
        }
        dmf dmfVar = this.i;
        if (i >= 40) {
            dmfVar.i();
        } else {
            if (i < 20) {
                if (i == 15) {
                    i = 15;
                }
            }
            dmfVar.j(dmfVar.e() / 2);
        }
        this.a.e(i);
        this.d.d(i);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
