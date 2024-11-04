package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpb {
    public final Object a;
    public final Object b;
    public final Object c;

    public kpb() {
        throw null;
    }

    public static synchronized kpb a() {
        kpb b;
        synchronized (kpb.class) {
            b = b(knh.b());
        }
        return b;
    }

    public static synchronized kpb b(knh knhVar) {
        kpb kpbVar;
        synchronized (kpb.class) {
            kpbVar = (kpb) knhVar.e(kpb.class);
        }
        return kpbVar;
    }

    static String h(String str) {
        return str.concat("|S|cre");
    }

    public static final ies s(byte b, byte b2) {
        jer i;
        jer i2;
        ier ierVar = new ier(null);
        boolean z = false;
        ierVar.a(false);
        if (b != 1) {
            if (b != 2) {
                i = jdl.a;
            } else {
                i = jer.i(false);
            }
        } else {
            i = jer.i(true);
        }
        ierVar.a = i;
        if ((b2 & 128) != 0) {
            z = true;
        }
        ierVar.a(z);
        int i3 = b2 & Byte.MAX_VALUE;
        if (i3 > 100) {
            i2 = jdl.a;
        } else {
            i2 = jer.i(Integer.valueOf(i3));
        }
        ierVar.b = i2;
        if (ierVar.d == 1) {
            return new ies(ierVar.a, ierVar.b, ierVar.c);
        }
        throw new IllegalStateException("Missing required properties: isCharging");
    }

    public static void u(kpb kpbVar, kuv kuvVar) {
        Object obj = ((kpb) kuvVar.b).b;
        long[] jArr = (long[]) kuvVar.a;
        kfl.b((long[]) kpbVar.b, (long[]) obj, jArr);
        kpb kpbVar2 = (kpb) kuvVar.b;
        Object obj2 = kpbVar2.c;
        long[] jArr2 = (long[]) kpbVar2.a;
        kfl.b((long[]) kpbVar.c, (long[]) obj2, jArr2);
        Object obj3 = ((kpb) kuvVar.b).a;
        long[] jArr3 = (long[]) kuvVar.a;
        kfl.b((long[]) kpbVar.a, (long[]) obj3, jArr3);
    }

    private static final String v(String str, String str2, String str3) {
        return str + "|T|" + str2 + "|" + str3;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Map, java.lang.Object] */
    private final kqr w(Uri uri) {
        jis jisVar;
        jin jinVar = new jin();
        Pattern pattern = ikq.a;
        jin jinVar2 = new jin();
        String encodedFragment = uri.getEncodedFragment();
        if (!TextUtils.isEmpty(encodedFragment) && encodedFragment.startsWith("transform=")) {
            jisVar = jis.n(kru.g("+").e().b(encodedFragment.substring(10)));
        } else {
            jisVar = jmi.a;
        }
        int size = jisVar.size();
        for (int i = 0; i < size; i++) {
            String str = (String) jisVar.get(i);
            Matcher matcher = ikq.a.matcher(str);
            if (matcher.matches()) {
                jinVar2.h(matcher.group(1));
            } else {
                throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
            }
        }
        jis g = jinVar2.g();
        int i2 = ((jmi) g).c;
        for (int i3 = 0; i3 < i2; i3++) {
            String str2 = (String) g.get(i3);
            ile ileVar = (ile) this.a.get(str2);
            if (ileVar != null) {
                jinVar.h(ileVar);
            } else {
                throw new ikk("No such transform: " + str2 + ": " + String.valueOf(uri));
            }
        }
        jis h = jinVar.g().h();
        kdo kdoVar = new kdo((char[]) null);
        kdoVar.f = this;
        String scheme = uri.getScheme();
        ikz ikzVar = (ikz) this.b.get(scheme);
        if (ikzVar != null) {
            kdoVar.a = ikzVar;
            kdoVar.b = this.c;
            kdoVar.e = h;
            kdoVar.c = uri;
            if (!h.isEmpty()) {
                ArrayList arrayList = new ArrayList(uri.getPathSegments());
                if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                    String str3 = (String) arrayList.get(arrayList.size() - 1);
                    ListIterator listIterator = h.listIterator(h.size());
                    while (listIterator.hasPrevious()) {
                        str3 = ((ile) listIterator.previous()).b();
                    }
                    arrayList.set(arrayList.size() - 1, str3);
                    uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
                }
            }
            kdoVar.d = uri;
            return new kqr(kdoVar);
        }
        throw new ikk(String.format("Cannot open, unregistered backend: %s", scheme));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized kqv c(String str, String str2, String str3) {
        kqv kqvVar;
        ?? r0 = this.a;
        String v = v(str, str2, str3);
        kqvVar = null;
        String string = r0.getString(v, null);
        if (!TextUtils.isEmpty(string)) {
            if (string.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    kqvVar = new kqv(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    Log.w("FirebaseInstanceId", "Failed to parse token: ".concat(e.toString()));
                }
            } else {
                kqvVar = new kqv(string, null, 0L);
            }
        }
        return kqvVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void d() {
        this.b.clear();
        this.a.edit().clear().commit();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void e(String str, String str2, String str3) {
        ?? r0 = this.a;
        String v = v(str, str2, str3);
        SharedPreferences.Editor edit = r0.edit();
        edit.remove(v);
        edit.commit();
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void f(String str, String str2, String str3, String str4, String str5) {
        String str6;
        long currentTimeMillis = System.currentTimeMillis();
        long j = kqv.a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str4);
            jSONObject.put("appVersion", str5);
            jSONObject.put("timestamp", currentTimeMillis);
            str6 = jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseInstanceId", "Failed to encode token: ".concat(e.toString()));
            str6 = null;
        }
        if (str6 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(v(str, str2, str3), str6);
        edit.commit();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized boolean g() {
        return this.a.getAll().isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void i(String str) {
        ?? r0 = this.a;
        long currentTimeMillis = System.currentTimeMillis();
        if (!r0.contains(h(str))) {
            ?? r02 = this.a;
            String h = h(str);
            SharedPreferences.Editor edit = r02.edit();
            edit.putString(h, String.valueOf(currentTimeMillis));
            edit.commit();
        } else {
            String string = this.a.getString(h(str), null);
            currentTimeMillis = 0;
            if (string != null) {
                try {
                    currentTimeMillis = Long.parseLong(string);
                } catch (NumberFormatException unused) {
                }
            }
        }
        this.b.put(str, Long.valueOf(currentTimeMillis));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final boolean j() {
        return this.a.isEmpty();
    }

    public final byte[] k() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        kfl.a(jArr, (long[]) this.a);
        kfl.b(jArr2, (long[]) this.b, jArr);
        kfl.b(jArr3, (long[]) this.c, jArr);
        byte[] k = kfl.k(jArr3);
        k[31] = (byte) ((kfh.a(jArr2) << 7) ^ k[31]);
        return k;
    }

    public final IllegalArgumentException l() {
        Object obj = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        return new IllegalArgumentException("Multiple entries with same key: " + obj3.toString() + "=" + obj2.toString() + " and " + obj3.toString() + "=" + obj.toString());
    }

    public final void m() {
        Object obj = this.b;
        if (obj != null) {
            ((isj) obj).c((View) this.a);
        }
    }

    public final Object n(Uri uri, ijv ijvVar) {
        return ijvVar.a(w(uri));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ikz, java.lang.Object] */
    public final void o(Uri uri) {
        kqr w = w(uri);
        w.e.f((Uri) w.c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ikz, java.lang.Object] */
    public final void p(Uri uri, Uri uri2) {
        kqr w = w(uri);
        Object obj = w.e;
        kqr w2 = w(uri2);
        if (obj == w2.e) {
            w.e.g((Uri) w.c, (Uri) w2.c);
            return;
        }
        throw new ikk("Cannot rename file across backends");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ikz, java.lang.Object] */
    public final boolean q(Uri uri) {
        kqr w = w(uri);
        return w.e.h((Uri) w.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final jbx r(final int i, final lim limVar) {
        ico icoVar = ico.MULTICOMPONENT_OPERATION;
        icq icqVar = new icq() { // from class: iet
            @Override // defpackage.icq
            public final lim a(lim limVar2) {
                return iji.f(i).r(limVar);
            }
        };
        return jbx.d(((icv) this.a).c(icoVar, (lim) this.b, icqVar)).f(new jxd() { // from class: ieu
            @Override // defpackage.jxd
            public final jyz a(Object obj) {
                lim limVar2 = ((ics) obj).a;
                if (limVar2.d() <= 0) {
                    return ivc.D(new iea("Missing multicomponent operation id"));
                }
                if (limVar2.a(0) != i) {
                    return ivc.D(new iea("Mismatching multicomponent operation id"));
                }
                return ivc.E(limVar2.w(1));
            }
        }, this.c);
    }

    public final String t() {
        Object obj = this.c;
        if (obj != null) {
            return ((hxw) obj).b;
        }
        Object obj2 = this.a;
        obj2.getClass();
        return ((hwo) obj2).a();
    }

    public kpb(isi isiVar, View view) {
        this.b = Build.VERSION.SDK_INT >= 34 ? new isl() : Build.VERSION.SDK_INT >= 33 ? new isj() : null;
        this.c = isiVar;
        this.a = view;
    }

    public kpb(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public kpb(String str, Class cls, kjg kjgVar) {
        this.a = str;
        this.c = cls;
        this.b = kjgVar;
    }

    public kpb(List list, String str, ArrayList arrayList) {
        this.b = list;
        this.c = str;
        this.a = arrayList;
    }

    public kpb(Map map, Map map2, kps kpsVar) {
        this.c = map;
        this.b = map2;
        this.a = kpsVar;
    }

    public kpb(mko mkoVar, mko mkoVar2, mko mkoVar3, byte[] bArr) {
        this.b = mkoVar;
        this.a = mkoVar2;
        this.c = mkoVar3;
    }

    public kpb(Context context) {
        this.b = new rx();
        this.c = context;
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(bqq.c(context), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (!file.createNewFile() || g()) {
                } else {
                    d();
                }
            } catch (IOException unused) {
            }
        }
    }

    public kpb(fhq fhqVar, knh knhVar, kqz kqzVar) {
        this.a = fhqVar;
        fma.aR(knhVar);
        this.c = knhVar;
        this.b = kqzVar;
        if (kqzVar.a() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }

    public kpb(idt idtVar, lim limVar, hot hotVar, hot hotVar2, jzd jzdVar) {
        if (icv.e(idtVar)) {
            this.b = limVar;
            ict a = icu.a();
            a.b(hotVar2.k());
            a.c(false);
            this.a = hotVar.m(idtVar, a.a());
            this.c = jzdVar;
            return;
        }
        throw new iek("The connected device does not support beacon actions.");
    }

    public kpb(knu knuVar) {
        this.c = new HashSet();
        this.a = new HashSet();
        this.b = knuVar;
    }

    public kpb(lim limVar, final String str, final String str2) {
        this.b = jtf.e;
        this.a = hwx.H(new hiy(this, limVar, 7, null));
        this.c = hwx.H(new jfe() { // from class: hwn
            @Override // defpackage.jfe
            public final Object a() {
                int i = jse.a;
                int i2 = jso.a;
                jsn jsnVar = new jsn();
                jsnVar.c(str.getBytes());
                jsnVar.a.put((byte) 0);
                jsnVar.e();
                jsnVar.c(str2.getBytes());
                return ((jtf) kpb.this.b).k(jsnVar.k().e());
            }
        });
    }

    public kpb(byte[] bArr) {
        this(new long[10], new long[10], new long[10]);
    }

    public kpb(kuv kuvVar) {
        this((byte[]) null);
        u(this, kuvVar);
    }

    public kpb(hxw hxwVar, hwo hwoVar) {
        jiy a;
        lim limVar;
        String str;
        hwx.U((hxwVar != null) ^ (hwoVar != null));
        this.c = hxwVar;
        this.a = hwoVar;
        if (hxwVar != null) {
            jiu h = jiy.h(hxwVar.f.size() + 3);
            for (hxx hxxVar : hxwVar.f) {
                int i = hxxVar.b;
                int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
                if (i2 == 0) {
                    throw null;
                }
                int i3 = i2 - 1;
                if (i3 == 0) {
                    h.d(hxxVar.d, Long.valueOf(i == 2 ? ((Long) hxxVar.c).longValue() : 0L));
                } else if (i3 == 1) {
                    h.d(hxxVar.d, Boolean.valueOf(i == 3 ? ((Boolean) hxxVar.c).booleanValue() : false));
                } else if (i3 == 2) {
                    h.d(hxxVar.d, Double.valueOf(i == 4 ? ((Double) hxxVar.c).doubleValue() : 0.0d));
                } else if (i3 == 3) {
                    String str2 = hxxVar.d;
                    if (i == 5) {
                        str = (String) hxxVar.c;
                    } else {
                        str = "";
                    }
                    h.d(str2, str);
                } else if (i3 == 4) {
                    String str3 = hxxVar.d;
                    if (i == 6) {
                        limVar = (lim) hxxVar.c;
                    } else {
                        limVar = lim.b;
                    }
                    h.d(str3, limVar.A());
                }
            }
            h.d("__phenotype_server_token", hxwVar.d);
            h.d("__phenotype_snapshot_token", hxwVar.b);
            h.d("__phenotype_configuration_version", Long.valueOf(hxwVar.e));
            a = h.a();
        } else {
            hwoVar.getClass();
            hwm hwmVar = hwoVar.b;
            jiu h2 = jiy.h(hwmVar.b.size() + 3);
            jmw listIterator = hwmVar.b.listIterator();
            while (listIterator.hasNext()) {
                hwl hwlVar = (hwl) listIterator.next();
                h2.d(hwlVar.b(), hwlVar.a());
            }
            h2.d("__phenotype_server_token", hwoVar.c.c);
            h2.d("__phenotype_snapshot_token", hwoVar.a());
            h2.d("__phenotype_configuration_version", Long.valueOf(hwoVar.c.d));
            a = h2.a();
        }
        this.b = a;
    }

    public kpb(kpb kpbVar) {
        this.b = Arrays.copyOf((long[]) kpbVar.b, 10);
        this.c = Arrays.copyOf((long[]) kpbVar.c, 10);
        this.a = Arrays.copyOf((long[]) kpbVar.a, 10);
    }

    public kpb(String str, Class cls) {
        this(str, cls, kjg.ASYMMETRIC_PRIVATE);
    }

    public kpb(mko mkoVar, mko mkoVar2, mko mkoVar3) {
        mkoVar.getClass();
        this.a = mkoVar;
        mkoVar2.getClass();
        this.c = mkoVar2;
        mkoVar3.getClass();
        this.b = mkoVar3;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List, java.lang.Object] */
    public kpb(List list) {
        List<ile> emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        this.b = new HashMap();
        this.a = new HashMap();
        this.c = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ikz ikzVar = (ikz) it.next();
            if (TextUtils.isEmpty(ikzVar.e())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                ikz ikzVar2 = (ikz) this.b.put(ikzVar.e(), ikzVar);
                if (ikzVar2 != null) {
                    throw new IllegalArgumentException("Cannot override Backend " + ikzVar2.getClass().getCanonicalName() + " with " + ikzVar.getClass().getCanonicalName());
                }
            }
        }
        for (ile ileVar : emptyList) {
            if (TextUtils.isEmpty(ileVar.a())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                ile ileVar2 = (ile) this.a.put(ileVar.a(), ileVar);
                if (ileVar2 != null) {
                    throw new IllegalArgumentException("Cannot to override Transform " + ileVar2.getClass().getCanonicalName() + " with " + ileVar.getClass().getCanonicalName());
                }
            }
        }
        this.c.addAll(emptyList2);
    }

    public kpb(Context context, String str) {
        ffc ffcVar = new ffc(context, str, null);
        this.b = new CopyOnWriteArrayList();
        if (str.startsWith("STREAMZ_")) {
            this.a = ffcVar;
            this.c = str;
            return;
        }
        throw new IllegalArgumentException("logSourceName should be prefixed by STREAMZ_");
    }
}
