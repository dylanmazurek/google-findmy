package defpackage;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dgk extends dfq {
    private static final String n = String.format("application/json; charset=%s", "utf-8");
    private final Object o;
    private final dfv p;
    private final String q;

    public dgk(String str, String str2, dfv dfvVar, dfu dfuVar) {
        super(str, dfuVar);
        this.o = new Object();
        this.p = dfvVar;
        this.q = str2;
    }

    @Override // defpackage.dfq
    public final String b() {
        return n;
    }

    @Override // defpackage.dfq
    public final void f(Object obj) {
        dfv dfvVar;
        synchronized (this.o) {
            dfvVar = this.p;
        }
        dfvVar.b(obj);
    }

    @Override // defpackage.dfq
    public final byte[] j() {
        try {
            String str = this.q;
            if (str == null) {
                return null;
            }
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            Log.wtf(dga.a, dga.a("Unsupported Encoding while trying to get the bytes of %s using %s", this.q, "utf-8"));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.dfq
    public final bso o(hww hwwVar) {
        try {
            return new bso(new JSONObject(new String((byte[]) hwwVar.b, bpw.i(hwwVar.c, "utf-8"))), bpw.j(hwwVar));
        } catch (UnsupportedEncodingException e) {
            return new bso(new dfp(e));
        } catch (JSONException e2) {
            return new bso(new dfp(e2));
        }
    }
}
