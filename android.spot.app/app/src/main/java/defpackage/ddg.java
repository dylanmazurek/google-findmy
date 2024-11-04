package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddg {
    public final Object a;

    public ddg(Object obj) {
        this.a = obj;
    }

    private static final kuv D() {
        kuv kuvVar = new kuv((char[]) null, (byte[]) null);
        kuvVar.y("reference");
        kuvVar.z("& ? > 0", 1L);
        return kuvVar;
    }

    public static String c(String str, ddf ddfVar, boolean z) {
        String replaceAll = str.replaceAll("\\W+", "");
        String str2 = ddfVar.c;
        if (z) {
            str2 = ".temp".concat(String.valueOf(str2));
        }
        return "lottie_cache_" + replaceAll + str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:            if (r6.contains(java.lang.Integer.valueOf(r7.c)) != false) goto L94;     */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddg.A(java.lang.Object):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final boolean B() {
        if (!this.a.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mko, java.lang.Object] */
    public final gok C() {
        evy evyVar = (evy) this.a.a();
        evyVar.getClass();
        return new gok(evyVar);
    }

    public final File a() {
        File file = new File(((Context) ((njz) this.a).a).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File b(String str, InputStream inputStream, ddf ddfVar) {
        File file = new File(a(), c(str, ddfVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        return file;
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final boolean d(Class cls) {
        return this.a.containsKey(cls);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final void e() {
        this.a.clear();
    }

    public final Object f(Object obj, int i, int i2) {
        Object obj2 = this.a;
        dno a = dno.a(obj, i, i2);
        Object f = ((dtm) obj2).f(a);
        a.b();
        return f;
    }

    public final void g(Object obj, int i, int i2, Object obj2) {
        ((dtm) this.a).g(dno.a(obj, i, i2), obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final ehu h(lqd lqdVar) {
        lqf b = lqf.b(lqdVar.c);
        if (b == null) {
            b = lqf.UNRECOGNIZED;
        }
        ehu ehuVar = (ehu) this.a.get(b);
        ehuVar.getClass();
        return ehuVar;
    }

    public final synchronized jis i(List list, Map map, gny gnyVar) {
        ijs.b();
        if (list.isEmpty()) {
            int i = jis.d;
            return jmi.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gwf gwfVar = (gwf) it.next();
            gwe gweVar = (gwe) map.get(gwfVar);
            if (gweVar != null) {
                gnz a = goa.a();
                a.b(gwfVar);
                a.e = jjr.m(gweVar.a);
                if (!TextUtils.isEmpty(null)) {
                    a.b = null;
                }
                arrayList.add(a.a());
            }
        }
        Long[] d = ((hri) this.a).A(gnyVar).d(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            gnz gnzVar = new gnz((goa) arrayList.get(i2));
            gnzVar.e(d[i2].longValue());
            arrayList2.add(gnzVar.a());
        }
        return jis.o(arrayList2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lqz, java.lang.Object] */
    public final gsr j() {
        int i = ((SharedPreferences) this.a.a()).getInt("last_successful_registration_account_type", gsr.b.e);
        gsr gsrVar = null;
        boolean z = false;
        for (gsr gsrVar2 : gsr.values()) {
            if (gsrVar2.e == i) {
                if (z) {
                    return null;
                }
                z = true;
                gsrVar = gsrVar2;
            }
        }
        if (!z) {
            return null;
        }
        return gsrVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lqz, java.lang.Object] */
    public final String k() {
        String string = ((SharedPreferences) this.a.a()).getString("internal_target_id", "");
        string.getClass();
        return string;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lqz, java.lang.Object] */
    public final String l() {
        String string = ((SharedPreferences) this.a.a()).getString("last_successful_registration_pseudonymous_cookie", "");
        string.getClass();
        return string;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lqz, java.lang.Object] */
    public final void m(String str) {
        str.getClass();
        ((SharedPreferences) this.a.a()).edit().putString("internal_target_id", str).apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:            if (r4 == 0) goto L42;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:            return r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:            throw null;     */
    /* JADX WARN: Type inference failed for: r0v0, types: [lqz, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n() {
        /*
            r10 = this;
            java.lang.Object r0 = r10.a
            java.lang.Object r0 = r0.a()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r1 = "last_used_registration_api"
            r2 = 3
            int r0 = r0.getInt(r1, r2)
            r1 = 2
            r3 = 1
            int[] r1 = new int[]{r3, r1, r2}
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L19:
            r8 = 0
            if (r5 >= r2) goto L2b
            r9 = r1[r5]
            if (r9 == 0) goto L2a
            if (r9 != r0) goto L27
            if (r6 == 0) goto L25
            goto L2f
        L25:
            r7 = r9
            r6 = 1
        L27:
            int r5 = r5 + 1
            goto L19
        L2a:
            throw r8
        L2b:
            if (r6 != 0) goto L2e
            goto L2f
        L2e:
            r4 = r7
        L2f:
            if (r4 == 0) goto L32
            return r4
        L32:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddg.n():int");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lqz, java.lang.Object] */
    public final void o(int i) {
        ((SharedPreferences) this.a.a()).edit().putInt("last_used_registration_api", i).apply();
    }

    public final ffc p(String str) {
        fex fexVar = new fex((Context) this.a, "CHIME");
        fexVar.e = str;
        fexVar.f = new gni();
        return fexVar.a();
    }

    public final ffc q() {
        fex k = ffc.k((Context) this.a, "CHIME");
        k.f = new gni();
        return k.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [gwf, java.lang.Object] */
    public final gna r(Intent intent) {
        jer jerVar;
        try {
            joo jooVar = glx.a;
            String stringExtra = intent.getStringExtra("com.google.android.libraries.notifications.ACCOUNT_REPRESENTATION");
            if (TextUtils.isEmpty(stringExtra)) {
                jerVar = jdl.a;
            } else {
                try {
                    jerVar = jer.i(fzo.j(stringExtra));
                } catch (RuntimeException e) {
                    ((jol) ((jol) ((jol) glx.a.g()).i(e)).j("com/google/android/libraries/notifications/internal/systemtray/impl/IntentExtrasHelper", "getAccountRepresentation", 70, "IntentExtrasHelper.java")).q();
                    jerVar = jdl.a;
                }
            }
            if (jerVar.g()) {
                return new gnc(jer.h(((goj) this.a.a()).a(jerVar.c())));
            }
            return new gnc(jdl.a);
        } catch (gnx e2) {
            return new gmy(e2);
        }
    }

    public final jis s(goa goaVar) {
        return ((gla) this.a).a(goaVar, jis.q(D().x()));
    }

    public final jis t(goa goaVar, String str) {
        kuv D = D();
        D.y(" AND ");
        D.y("group_id");
        D.z("=?", str);
        return ((gla) this.a).a(goaVar, jis.q(D.x()));
    }

    public final jis u(goa goaVar, String... strArr) {
        return ((gla) this.a).a(goaVar, glc.b(D().x(), "thread_id", strArr));
    }

    public final void v(goa goaVar, String... strArr) {
        ((gla) this.a).b(goaVar, glc.b(null, "thread_id", strArr));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [goj, java.lang.Object] */
    public final goa w(gwf gwfVar) {
        try {
            return this.a.a(gwfVar);
        } catch (gnx unused) {
            gnz a = goa.a();
            a.b(gwfVar);
            a.e = new jms(gwo.a);
            goa a2 = a.a();
            Object obj = this.a;
            jis q = jis.q(a2);
            q.getClass();
            try {
                Long[] b = ((goo) obj).b.b(q);
                b.getClass();
                if (b.length == 1) {
                    gnz gnzVar = new gnz(a2);
                    gnzVar.e(b[0].longValue());
                    return gnzVar.a();
                }
                throw new goi();
            } catch (Exception e) {
                throw new goi(e);
            }
        }
    }

    public final jyz x() {
        return ((imf) this.a).a();
    }

    public final boolean y(long j) {
        if (j > 0 && j <= 2147483647L) {
            if (((Random) this.a).nextInt((int) j) == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Set, java.lang.Object] */
    public final void z(Object obj) {
        if (!this.a.isEmpty()) {
            for (njz njzVar : this.a) {
                Object obj2 = njzVar.a;
                long c = fzo.c();
                if (c != -1) {
                    ljj ljjVar = ((gbo) obj).c;
                    long j = c * 1000;
                    if (!ljjVar.b.y()) {
                        ljjVar.t();
                    }
                    gbs gbsVar = (gbs) ljjVar.b;
                    gbs gbsVar2 = gbs.h;
                    gbsVar.a |= 4;
                    gbsVar.e = j;
                }
                gbo gboVar = (gbo) obj;
                gbv gbvVar = gboVar.b;
                int i = 1;
                if (gbvVar instanceof gbv) {
                    if (gboVar.c.ao(gec.a)) {
                        if (!gbvVar.e()) {
                            gbvVar.h(true);
                        }
                    } else {
                        gbvVar.h(false);
                    }
                }
                gcf gcfVar = ((gcc) njzVar.a).b;
                ljj ljjVar2 = gboVar.c;
                gbv gbvVar2 = gboVar.b;
                juv juvVar = ((gbs) ljjVar2.b).c;
                if (juvVar == null) {
                    juvVar = juv.e;
                }
                if ((juvVar.a & 2048) != 0) {
                    int i2 = gbvVar2.i();
                    int D = a.D(((gbs) ljjVar2.b).d);
                    if (D != 0) {
                        i = D;
                    }
                    if (i != i2 && gcfVar.d(gboVar, i2)) {
                    }
                } else {
                    gcfVar.a.add(obj);
                }
                ((gcc) njzVar.a).b();
            }
        }
    }

    public ddg(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ddg() {
        this.a = new HashMap();
    }

    public ddg(long j) {
        this.a = new dnn(j);
    }

    public ddg(char[] cArr) {
        this.a = new Random();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, java.lang.Object] */
    public ddg(ddg ddgVar) {
        this.a = DesugarCollections.unmodifiableMap(new HashMap((Map) ddgVar.a));
    }

    public ddg(lqz lqzVar, byte[] bArr) {
        lqzVar.getClass();
        this.a = lqzVar;
    }

    public ddg(byte[] bArr) {
        this.a = new HashMap();
    }

    public ddg(Context context, Map map) {
        jiu jiuVar = new jiu();
        for (Map.Entry entry : map.entrySet()) {
            jiuVar.d((Class) entry.getKey(), new elo(context, (Class) entry.getValue()));
        }
        this.a = jiuVar.b();
    }

    public ddg(mko mkoVar, short[] sArr) {
        mkoVar.getClass();
        this.a = mkoVar;
    }

    public ddg(lqz lqzVar) {
        lqzVar.getClass();
        this.a = lqzVar;
    }

    public ddg(mko mkoVar, byte[] bArr) {
        mkoVar.getClass();
        this.a = mkoVar;
    }

    public ddg(mko mkoVar) {
        mkoVar.getClass();
        this.a = mkoVar;
    }
}
