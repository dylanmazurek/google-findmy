package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvp extends dfq {
    private final lkq n;
    private final dfv o;
    private final lkx p;
    private String q;
    private final eld r;

    public dvp(lkq lkqVar, String str, lkx lkxVar, eld eldVar, dfv dfvVar, dfu dfuVar) {
        super(str, dfuVar);
        lkqVar.getClass();
        this.n = lkqVar;
        this.r = eldVar;
        this.o = dfvVar;
        lkxVar.getClass();
        this.p = lkxVar;
    }

    @Override // defpackage.dfq
    public final Map d() {
        HashMap hashMap = new HashMap();
        String b = this.r.b();
        this.q = b;
        hashMap.put("Authorization", "Bearer ".concat(String.valueOf(b)));
        hashMap.put("Accept-Language", Locale.getDefault().toLanguageTag());
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("x-obscura-nonce", null);
        }
        return hashMap;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.dfq
    public final void e(dfy dfyVar) {
        if (dfyVar instanceof dfg) {
            eld eldVar = this.r;
            String str = this.q;
            ?? r2 = eldVar.c;
            if (r2 != 0) {
                r2.execute(new cui(eldVar, str, 6, (char[]) null));
            }
        }
        super.e(dfyVar);
    }

    @Override // defpackage.dfq
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        this.o.b((lkq) obj);
    }

    @Override // defpackage.dfq
    public final byte[] j() {
        return this.n.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dfq
    public final bso o(hww hwwVar) {
        try {
            return new bso(this.p.i((byte[]) hwwVar.b, lja.a()), bpw.j(hwwVar));
        } catch (ljy e) {
            return new bso(new dfp(e));
        }
    }
}
