package defpackage;

import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kub {
    public Object a;
    public final Object b;

    protected kub() {
        throw null;
    }

    public static kub a() {
        ktz ktzVar = new ktz(jdl.a, jmo.a);
        new HashSet();
        jmw listIterator = ktzVar.b.listIterator();
        while (listIterator.hasNext()) {
            jer jerVar = (jer) listIterator.next();
            if (jerVar.g()) {
                throw null;
            }
        }
        return new kub(ktzVar);
    }

    private final File i() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = new File(((knh) this.b).a().getFilesDir(), "PersistedInstallation." + ((knh) this.b).g() + ".json");
                }
            }
        }
        return (File) this.a;
    }

    public final jyz b(jxc jxcVar, Executor executor) {
        executor.getClass();
        final jyc jycVar = new jyc(executor, this);
        jxg jxgVar = new jxg(jycVar, jxcVar, 2);
        final jzm jzmVar = new jzm();
        final jyz jyzVar = (jyz) ((AtomicReference) this.b).getAndSet(jzmVar);
        final jzt jztVar = new jzt(jxgVar);
        jyzVar.c(jztVar, jycVar);
        final jyz F = ivc.F(jztVar);
        Runnable runnable = new Runnable() { // from class: jya
            @Override // java.lang.Runnable
            public final void run() {
                jzt jztVar2 = jzt.this;
                if (jztVar2.isDone()) {
                    jzmVar.o(jyzVar);
                } else if (F.isCancelled() && jycVar.compareAndSet(jyb.NOT_RUN, jyb.CANCELLED)) {
                    jztVar2.cancel(false);
                }
            }
        };
        F.c(runnable, jxv.a);
        jztVar.c(runnable, jxv.a);
        return F;
    }

    public final kro c() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(i());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        krn a = kro.a();
        a.a = optString;
        a.c(new int[]{1, 2, 3, 4, 5}[optInt]);
        a.b = optString2;
        a.c = optString3;
        a.d(optLong);
        a.b(optLong2);
        a.d = optString4;
        return a.a();
    }

    public final void d(kro kroVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", kroVar.a);
            int i = kroVar.g;
            int i2 = i - 1;
            if (i != 0) {
                jSONObject.put("Status", i2);
                jSONObject.put("AuthToken", kroVar.b);
                jSONObject.put("RefreshToken", kroVar.c);
                jSONObject.put("TokenCreationEpochInSecs", kroVar.e);
                jSONObject.put("ExpiresInSecs", kroVar.d);
                jSONObject.put("FisError", kroVar.f);
                File createTempFile = File.createTempFile("PersistedInstallation", "tmp", ((knh) this.b).a().getFilesDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
                fileOutputStream.close();
                if (createTempFile.renameTo(i())) {
                    return;
                } else {
                    throw new IOException("unable to rename the tmpfile to PersistedInstallation");
                }
            }
            throw null;
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final kpr e() {
        Map unmodifiableMap;
        ?? r1 = this.a;
        if (r1 == 0) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = DesugarCollections.unmodifiableMap(new HashMap((Map) r1));
        }
        return new kpr((String) this.b, unmodifiableMap);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    public final void f(Annotation annotation) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(kpz.class, annotation);
    }

    public final hzr g() {
        this.a.getClass();
        return new hzr(((Boolean) this.a).booleanValue(), ((jin) this.b).g());
    }

    public final void h() {
        boolean z;
        if (this.a == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "A SourcePolicy can only set internal() or external() once.");
        this.a = false;
    }

    public kub(String str) {
        this.a = null;
        this.b = str;
    }

    public kub(knh knhVar) {
        this.b = knhVar;
    }

    private kub(ktz ktzVar) {
        this.b = ktzVar;
        jiu jiuVar = new jiu();
        jmw listIterator = ktzVar.b.listIterator();
        while (listIterator.hasNext()) {
            jer jerVar = (jer) listIterator.next();
            if (!jerVar.g()) {
                this.a = jiuVar.b();
            } else {
                throw null;
            }
        }
    }

    public kub(char[] cArr) {
        this.b = new jin();
    }

    public kub(byte[] bArr) {
        this.b = new AtomicReference(jyv.a);
        this.a = new mep();
    }
}
