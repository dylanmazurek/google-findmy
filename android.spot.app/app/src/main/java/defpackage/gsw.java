package defpackage;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsw extends mnp implements mol {
    long a;
    int b;
    final /* synthetic */ gsz c;
    final /* synthetic */ Set d;
    final /* synthetic */ Map e;
    final /* synthetic */ leo f;
    final /* synthetic */ gny g;
    final /* synthetic */ lgp h;
    final /* synthetic */ int i;
    final /* synthetic */ gsr j;
    final /* synthetic */ String k;
    final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsw(gsz gszVar, Set set, Map map, leo leoVar, gny gnyVar, lgp lgpVar, int i, gsr gsrVar, String str, String str2, mmx mmxVar) {
        super(2, mmxVar);
        this.c = gszVar;
        this.d = set;
        this.e = map;
        this.f = leoVar;
        this.g = gnyVar;
        this.h = lgpVar;
        this.i = i;
        this.j = gsrVar;
        this.k = str;
        this.l = str2;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gsw) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [lqz, java.lang.Object] */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        long j;
        mne mneVar = mne.a;
        boolean z = true;
        if (this.b != 0) {
            j = this.a;
            mjo.o(obj);
        } else {
            mjo.o(obj);
            long epochMilli = fma.i().toEpochMilli();
            gsz gszVar = this.c;
            Set set = this.d;
            Map map = this.e;
            leo leoVar = this.f;
            gny gnyVar = this.g;
            lgp lgpVar = this.h;
            this.a = epochMilli;
            this.b = 1;
            obj = gszVar.c(set, map, leoVar, gnyVar, epochMilli, lgpVar, this);
            if (obj != mneVar) {
                j = epochMilli;
            } else {
                return mneVar;
            }
        }
        gna gnaVar = (gna) obj;
        if (gnaVar.g()) {
            gsz gszVar2 = this.c;
            gny gnyVar2 = this.g;
            int i = this.i;
            mko mkoVar = gszVar2.b;
            ddg e = gszVar2.e(gnyVar2);
            String q = fzo.q(((grh) mkoVar).a());
            gsr gsrVar = this.j;
            String str = this.k;
            String str2 = this.l;
            if (!this.g.a() || !this.g.b()) {
                z = false;
            }
            gsrVar.getClass();
            SharedPreferences.Editor putBoolean = ((SharedPreferences) e.a.a()).edit().putInt("last_successful_registration_request_hash_code", i).putString("last_successful_registration_environment_url", q).putLong("last_successful_registration_time_ms", j).putBoolean("is_registered_to_unified_fcm_registration", z);
            if (gsrVar != gsr.a) {
                putBoolean.putInt("last_successful_registration_account_type", gsrVar.e);
            }
            if (str != null) {
                putBoolean.putString("last_successful_registration_pseudonymous_cookie", str);
            }
            if (str2 != null) {
                putBoolean.putString("last_successful_fcm_registration_token", str2);
            }
            putBoolean.apply();
        }
        return gnaVar;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new gsw(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, mmxVar);
    }
}
