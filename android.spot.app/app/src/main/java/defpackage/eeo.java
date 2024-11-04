package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eeo extends mpe implements moh {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeo(int i) {
        super(1);
        this.b = i;
        this.a = "";
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [msw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v66, types: [mmx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v69, types: [java.lang.Object, jyz] */
    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        switch (this.b) {
            case 0:
                ((cfn) this.a).l(mlh.a);
                return mlh.a;
            case 1:
                evh evhVar = (evh) ((jer) obj).f();
                if (evhVar != null) {
                    Object obj2 = this.a;
                    evo evoVar = ((edl) obj2).an;
                    if (evoVar == null) {
                        mpd.b("snackbarUtil");
                        evoVar = null;
                    }
                    evoVar.e(((ag) obj2).F(), evhVar);
                }
                return mlh.a;
            case 2:
                ((cfn) this.a).l(mlh.a);
                return mlh.a;
            case 3:
                ((cfn) this.a).l(mlh.a);
                return mlh.a;
            case 4:
                ((cfn) this.a).l(mlh.a);
                return mlh.a;
            case 5:
                ((cfn) this.a).l(mlh.a);
                return mlh.a;
            case 6:
                ((ekx) this.a).d.l(mlh.a);
                return mlh.a;
            case 7:
                ekw ekwVar = (ekw) obj;
                ekwVar.getClass();
                lpz a = ((ekx) this.a).a.a(ekwVar.a);
                kyf kyfVar = a.b;
                if (kyfVar == null) {
                    kyfVar = kyf.r;
                }
                kye b = kye.b(kyfVar.k);
                if (b == null) {
                    b = kye.UNRECOGNIZED;
                }
                if (b == kye.SHARED_WITH_ME) {
                    Collection values = ekwVar.d.values();
                    if (!(values instanceof Collection) || !values.isEmpty()) {
                        Iterator it = values.iterator();
                        while (it.hasNext()) {
                            kzb kzbVar = (kzb) ((ekv) it.next()).a.d.f();
                            if (kzbVar != null) {
                                kym kymVar = kzbVar.b;
                                if (kymVar == null) {
                                    kymVar = kym.f;
                                }
                                if (kymVar != null && kymVar.b == 9) {
                                }
                            }
                        }
                    }
                    Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
                    ofEpochMilli.getClass();
                    kyf kyfVar2 = a.b;
                    if (kyfVar2 == null) {
                        kyfVar2 = kyf.r;
                    }
                    lln llnVar = kyfVar2.q;
                    if (llnVar == null) {
                        llnVar = lln.c;
                    }
                    llnVar.getClass();
                    Instant au = hzc.au(llnVar);
                    au.getClass();
                    Duration between = Duration.between(au, ofEpochMilli);
                    between.getClass();
                    Duration ofSeconds = Duration.ofSeconds(lua.a.a().p());
                    ofSeconds.getClass();
                    if (between.compareTo(ofSeconds) < 0) {
                        return eki.b;
                    }
                }
                return eki.a;
            case 8:
                ekx ekxVar = (ekx) this.a;
                ilv ilvVar = ekxVar.i;
                lqd lqdVar = ekxVar.b;
                eiv b2 = ilvVar.b(lqdVar);
                jiy n = ekxVar.j.n(lqdVar);
                lqc a2 = ekxVar.h.a();
                if (a2 == null) {
                    ljh k = lqc.j.k();
                    k.getClass();
                    a2 = hzc.al(k);
                }
                kyh kyhVar = ekxVar.e;
                jiy jiyVar = b2.h;
                LinkedHashMap linkedHashMap = new LinkedHashMap(mkm.H(jiyVar.size()));
                for (Map.Entry entry : jiyVar.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    value.getClass();
                    eit eitVar = (eit) value;
                    eis eisVar = (eis) n.get(entry.getKey());
                    if (eisVar == null) {
                        eisVar = eis.NOT_IN_RANGE;
                    }
                    eisVar.getClass();
                    linkedHashMap.put(key, new ekv(eitVar, eisVar));
                }
                return new ekw(a2, b2, kyhVar, linkedHashMap);
            case 9:
                ark arkVar = (ark) obj;
                arkVar.getClass();
                arkVar.q(((Number) ((erz) this.a).a.a()).floatValue());
                arkVar.r(((Number) ((erz) this.a).a.a()).floatValue());
                arkVar.l(((Number) ((erz) this.a).b.c()).floatValue());
                return mlh.a;
            case 10:
                cak cakVar = (cak) obj;
                cakVar.getClass();
                ((jni) ((jni) evw.a.f()).i(cakVar).j("com/google/android/apps/adm/pds/DataStoreProvider$createAccountDataStore$1", "invoke", 64, "DataStoreProvider.kt")).r("Error reading stored data, using default value");
                return ((evw) this.a).d;
            case 11:
                gok gokVar = (gok) obj;
                gokVar.getClass();
                return new hri((Object) gokVar, (msw) this.a);
            case 12:
                if (obj == this.a) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 13:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                Object key2 = entry2.getKey();
                mlo mloVar = (mlo) this.a;
                return mloVar.i(key2) + "=" + mloVar.i(entry2.getValue());
            case 14:
                String str = (String) obj;
                str.getClass();
                return ((String) this.a).concat(str);
            case 15:
                String str2 = (String) obj;
                str2.getClass();
                if (moz.g(str2)) {
                    int length = str2.length();
                    Object obj3 = this.a;
                    if (length < ((String) obj3).length()) {
                        return obj3;
                    }
                    return str2;
                }
                return ((String) this.a).concat(str2);
            case 16:
                mqg mqgVar = (mqg) obj;
                mqgVar.getClass();
                return moz.m(this.a, mqgVar);
            case 17:
                this.a.p(mlh.a);
                return mlh.a;
            case 18:
                this.a.cancel(false);
                return mlh.a;
            case 19:
                Throwable th = (Throwable) obj;
                Object newInstance = ((Constructor) this.a).newInstance(th.getMessage(), th);
                newInstance.getClass();
                return (Throwable) newInstance;
            default:
                Throwable th2 = (Throwable) obj;
                Object newInstance2 = ((Constructor) this.a).newInstance(th2.getMessage());
                newInstance2.getClass();
                Throwable th3 = (Throwable) newInstance2;
                th3.initCause(th2);
                return th3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeo(int i, byte[] bArr) {
        super(1);
        this.b = i;
        this.a = "    ";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeo(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }
}
