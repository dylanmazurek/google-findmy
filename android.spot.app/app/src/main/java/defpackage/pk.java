package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pk {
    final /* synthetic */ oc g;
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();
    private final Map h = new LinkedHashMap();
    public final List c = new ArrayList();
    public final transient Map d = new LinkedHashMap();
    public final Map e = new LinkedHashMap();
    public final Bundle f = new Bundle();

    public pk(oc ocVar) {
        this.g = ocVar;
    }

    private final void g(String str) {
        if (((Integer) this.b.get(str)) == null) {
            ph phVar = ph.a;
            Iterator a = moz.R(new mrg(phVar, new mrc(phVar), 1)).a();
            while (a.hasNext()) {
                Number number = (Number) a.next();
                if (!this.a.containsKey(Integer.valueOf(number.intValue()))) {
                    c(number.intValue(), str);
                    return;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    }

    public final pf a(String str, pn pnVar, pd pdVar) {
        g(str);
        this.d.put(str, new bfi(pdVar, pnVar, null));
        if (this.e.containsKey(str)) {
            Object obj = this.e.get(str);
            this.e.remove(str);
            pdVar.a(obj);
        }
        pc pcVar = (pc) ct.b(this.f, str, pc.class);
        if (pcVar != null) {
            this.f.remove(str);
            pdVar.a(pnVar.b(pcVar.a, pcVar.b));
        }
        return new pj(this, str, pnVar);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List, java.lang.Object] */
    public final pf b(final String str, cfc cfcVar, final pn pnVar, final pd pdVar) {
        cex N = cfcVar.N();
        if (!N.b.a(cew.STARTED)) {
            g(str);
            bfi bfiVar = (bfi) this.h.get(str);
            if (bfiVar == null) {
                bfiVar = new bfi(N);
            }
            cfa cfaVar = new cfa() { // from class: pg
                @Override // defpackage.cfa
                public final void a(cfc cfcVar2, cev cevVar) {
                    pk pkVar = pk.this;
                    String str2 = str;
                    if (cev.ON_START == cevVar) {
                        pn pnVar2 = pnVar;
                        pd pdVar2 = pdVar;
                        pkVar.d.put(str2, new bfi(pdVar2, pnVar2, null));
                        if (pkVar.e.containsKey(str2)) {
                            Object obj = pkVar.e.get(str2);
                            pkVar.e.remove(str2);
                            pdVar2.a(obj);
                        }
                        pc pcVar = (pc) ct.b(pkVar.f, str2, pc.class);
                        if (pcVar != null) {
                            pkVar.f.remove(str2);
                            pdVar2.a(pnVar2.b(pcVar.a, pcVar.b));
                            return;
                        }
                        return;
                    }
                    if (cev.ON_STOP == cevVar) {
                        pkVar.d.remove(str2);
                    } else if (cev.ON_DESTROY == cevVar) {
                        pkVar.d(str2);
                    }
                }
            };
            ((cex) bfiVar.b).a(cfaVar);
            bfiVar.a.add(cfaVar);
            this.h.put(str, bfiVar);
            return new pi(this, str, pnVar);
        }
        throw new IllegalStateException("LifecycleOwner " + cfcVar + " is attempting to register while current state is " + N.b + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final void c(int i, String str) {
        Map map = this.a;
        Integer valueOf = Integer.valueOf(i);
        map.put(valueOf, str);
        this.b.put(str, valueOf);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Iterable] */
    public final void d(String str) {
        Integer num;
        if (!this.c.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.d.remove(str);
        if (this.e.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.e.get(str));
            this.e.remove(str);
        }
        if (this.f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((pc) ct.b(this.f, str, pc.class)));
            this.f.remove(str);
        }
        bfi bfiVar = (bfi) this.h.get(str);
        if (bfiVar != null) {
            Iterator it = bfiVar.a.iterator();
            while (it.hasNext()) {
                ((cex) bfiVar.b).c((cfa) it.next());
            }
            bfiVar.a.clear();
            this.h.remove(str);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [pd, java.lang.Object] */
    public final boolean e(int i, int i2, Intent intent) {
        Object obj;
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        bfi bfiVar = (bfi) this.d.get(str);
        if (bfiVar != null) {
            obj = bfiVar.b;
        } else {
            obj = null;
        }
        if (obj != null && this.c.contains(str)) {
            bfiVar.b.a(((pn) bfiVar.a).b(i2, intent));
            this.c.remove(str);
            return true;
        }
        this.e.remove(str);
        this.f.putParcelable(str, new pc(i2, intent));
        return true;
    }

    public final void f(int i, pn pnVar, Object obj) {
        Bundle bundle;
        oc ocVar = this.g;
        bet c = pnVar.c(ocVar, obj);
        if (c != null) {
            new Handler(Looper.getMainLooper()).post(new oa(this, i, c, 0, (byte[]) null));
            return;
        }
        Intent a = pnVar.a(ocVar, obj);
        if (a.getExtras() != null) {
            Bundle extras = a.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                a.setExtrasClassLoader(ocVar.getClassLoader());
            }
        }
        if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if (amr.i("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", a.getAction())) {
            String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            bpa.a(ocVar, stringArrayExtra, i);
            return;
        }
        if (amr.i("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", a.getAction())) {
            pm pmVar = (pm) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                pmVar.getClass();
                ocVar.startIntentSenderForResult(pmVar.a, i, pmVar.b, pmVar.c, pmVar.d, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new oa(this, i, e, 2));
                return;
            }
        }
        ocVar.startActivityForResult(a, i, bundle);
    }

    public pk() {
    }
}
