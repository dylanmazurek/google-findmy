package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.zip.InflaterInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpp implements gph {
    public static final /* synthetic */ int b = 0;
    private static final joo c = joo.m("GnpSdk");
    private static final Set d = jjr.p(1, 2, 3);
    public final mko a;
    private final mko e;
    private final mko f;
    private final mko g;
    private final mko h;
    private final mko i;
    private final String j;
    private final mko k;
    private final mko l;
    private final mko m;
    private final mko n;

    public gpp(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, Context context, mko mkoVar6, mko mkoVar7, mko mkoVar8, mko mkoVar9, mko mkoVar10) {
        this.e = mkoVar;
        this.f = mkoVar2;
        this.g = mkoVar3;
        this.h = mkoVar4;
        this.i = mkoVar5;
        this.j = context.getPackageName();
        this.k = mkoVar6;
        this.l = mkoVar7;
        this.a = mkoVar8;
        this.m = mkoVar9;
        this.n = mkoVar10;
    }

    private final jer f(byte[] bArr, boolean z, gpf gpfVar) {
        gna gmyVar;
        lcr lcrVar;
        long epochMilli = fma.i().toEpochMilli();
        joo jooVar = grc.a;
        bArr.getClass();
        try {
            InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inflaterInputStream.available()));
            byte[] bArr2 = new byte[8192];
            for (int read = inflaterInputStream.read(bArr2); read >= 0; read = inflaterInputStream.read(bArr2)) {
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
            gmyVar = new gnc(byteArray);
        } catch (Exception e) {
            ((jol) ((jol) grc.a.f()).i(e)).r("Failed to decompress the decrypted bytes.");
            gmyVar = new gmy(e);
        }
        ((imn) ((gvg) this.k.a()).g.a()).b(fma.i().toEpochMilli() - epochMilli, this.j, Boolean.valueOf(gmyVar.e()));
        if (!gmyVar.g()) {
            ((jol) ((jol) ((jol) c.g()).i(gmyVar.d())).j("com/google/android/libraries/notifications/platform/entrypoints/push/PushIntentHandler", "decompressBytesLogOnFailure", (char) 564, "PushIntentHandler.java")).r("Payload decompression failed.");
            if (z) {
                lcrVar = lcr.FAILED_TO_DECOMPRESS_FALLBACK_TO_PLACEHOLDER;
            } else {
                lcrVar = lcr.FAILED_TO_DECOMPRESS;
            }
            gqz gqzVar = (gqz) this.f.a();
            grb j = ((ktn) this.g.a()).j(lcrVar);
            j.a(gpfVar.b());
            gqzVar.a(j);
            return jdl.a;
        }
        return jer.i((byte[]) gmyVar.b());
    }

    private final jer g(lim limVar, boolean z, gpf gpfVar) {
        byte[] bArr;
        boolean z2;
        jer i;
        lcr lcrVar;
        limVar.A();
        if (!((jer) ((lsi) this.i).b).g()) {
            ((jol) ((jol) c.f()).j("com/google/android/libraries/notifications/platform/entrypoints/push/PushIntentHandler", "decryptEncryptedBytesLogOnFailure", 504, "PushIntentHandler.java")).r("Encrypted payload couldn't be decrypted since GnpEncryptionManager is not found.");
            i = jdl.a;
        } else {
            long epochMilli = fma.i().toEpochMilli();
            try {
                bArr = (byte[]) ((gna) jyr.b(((grm) ((jer) ((lsi) this.i).b).c()).a(), Exception.class)).c();
            } catch (Exception e) {
                ((jol) ((jol) ((jol) c.g()).i(e)).j("com/google/android/libraries/notifications/platform/entrypoints/push/PushIntentHandler", "decryptEncryptedBytesLogOnFailure", (char) 519, "PushIntentHandler.java")).r("Failed to retrieve the decrypted data.");
                bArr = null;
            }
            long epochMilli2 = fma.i().toEpochMilli() - epochMilli;
            if (bArr == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            gvg gvgVar = (gvg) this.k.a();
            String str = this.j;
            imn imnVar = (imn) gvgVar.d.a();
            Boolean valueOf = Boolean.valueOf(z2);
            imnVar.b(epochMilli2, str, valueOf, false);
            ((imq) ((gvg) this.k.a()).c.a()).b(this.j, valueOf, Boolean.valueOf(z), false);
            if (z2) {
                if (z) {
                    lcrVar = lcr.FAILED_TO_DECRYPT_PAYLOAD_FALLBACK_TO_PLACEHOLDER;
                } else {
                    lcrVar = lcr.FAILED_TO_DECRYPT_PAYLOAD_NO_PLACEHOLDER;
                }
                gqz gqzVar = (gqz) this.f.a();
                grb j = ((ktn) this.g.a()).j(lcrVar);
                j.a(gpfVar.b());
                gqzVar.a(j);
                i = jdl.a;
            } else {
                i = jer.i(bArr);
            }
        }
        if (i.g()) {
            jer f = f((byte[]) i.c(), z, gpfVar);
            if (f.g()) {
                return gpj.a((byte[]) f.c());
            }
        }
        return jdl.a;
    }

    private final void h() {
        if (((jer) ((lsi) this.l).b).g()) {
            ((gpg) ((jer) ((lsi) this.l).b).c()).a();
        }
    }

    private static final jer i(gpf gpfVar) {
        lfr lfrVar;
        byte[] bArr = gpfVar.e;
        if (bArr == null) {
            return jdl.a;
        }
        joo jooVar = gpj.a;
        try {
            ljn m = ljn.m(lfr.d, bArr, 0, bArr.length, lja.a());
            ljn.A(m);
            lfrVar = (lfr) m;
        } catch (ljy e) {
            ((jol) ((jol) gpj.a.f()).i(e)).r("Failed to parse AndroidFcmPayload proto.");
            lfrVar = null;
        }
        return jer.h(lfrVar);
    }

    private static final jer j(gpf gpfVar, final boolean z) {
        joo jooVar = gpj.a;
        String str = gpfVar.d;
        lfs lfsVar = null;
        byte[] bArr = null;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 1);
            } catch (IllegalArgumentException e) {
                ((jol) ((jol) gpj.a.f()).i(e)).r("Failed to decode payload string into bytes.");
            }
            lfsVar = gpj.b(bArr);
        }
        return jer.h(lfsVar).b(new jei() { // from class: gpk
            @Override // defpackage.jei
            public final Object a(Object obj) {
                gpq gpqVar;
                gpn gpnVar = new gpn();
                gpnVar.b((lfs) obj);
                if (z) {
                    gpqVar = gpq.c;
                } else {
                    gpqVar = gpq.a;
                }
                gpnVar.c(gpqVar);
                return gpnVar.a();
            }
        });
    }

    @Override // defpackage.gov
    public final /* synthetic */ int a(Intent intent) {
        return 10;
    }

    @Override // defpackage.gov
    public final void b(Intent intent, gnd gndVar, long j) {
        d(gpf.a(intent), gndVar, j);
    }

    @Override // defpackage.gov
    public final boolean c(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return false;
        }
        jol jolVar = (jol) c.k().j("com/google/android/libraries/notifications/platform/entrypoints/push/PushIntentHandler", "validate", 112, "PushIntentHandler.java");
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        StringBuilder sb = new StringBuilder("Extras: [\n");
        if (extras != null) {
            for (String str : extras.keySet()) {
                sb.append(str);
                sb.append(" : ");
                sb.append(extras.get(str));
                sb.append("\n");
            }
        }
        sb.append("]");
        jolVar.y("onReceive: %s \n %s", action, sb.toString());
        gpf a = gpf.a(intent);
        int i = a.g;
        if (i != 0) {
            int i2 = i - 1;
            if (i2 != 0 && i2 != 1) {
                if (i2 != 2) {
                    return false;
                }
                return true;
            }
            return a.c();
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0270, code lost:            if (r1.a.isEmpty() == false) goto L97;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x027c, code lost:            r0 = ((defpackage.ktn) r26.g.a()).j(defpackage.lcr.RECIPIENT_NOT_FOUND);        r1 = r14.d;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x028c, code lost:            if (r1 != null) goto L100;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x028e, code lost:            r1 = defpackage.lgf.s;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0290, code lost:            r0.c(r1);        r0.a(r27.b());     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x029e, code lost:            if (defpackage.lvp.d() == false) goto L106;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02a0, code lost:            r1 = (defpackage.gqz) r26.f.a();        r2 = r14.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x02aa, code lost:            if (r2 != null) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02ac, code lost:            r2 = defpackage.lgo.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02ae, code lost:            r2 = r2.a;        r2.getClass();        r0.n = r2;        r1.a(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02cb, code lost:            h();     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02ce, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02b9, code lost:            r1 = (defpackage.gqz) r26.f.a();        r2 = r14.b;        r2.getClass();        r0.h = r2;        r1.a(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0279, code lost:            if (r14.b.isEmpty() != false) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0351, code lost:            if (r3 != false) goto L134;     */
    @Override // defpackage.gph
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(final defpackage.gpf r27, final defpackage.gnd r28, final long r29) {
        /*
            Method dump skipped, instructions count: 1209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpp.d(gpf, gnd, long):void");
    }

    public final void e(lfs lfsVar, goa goaVar, gpf gpfVar, gnd gndVar) {
        lgv lgvVar = lfsVar.e;
        if (lgvVar == null) {
            lgvVar = lgv.e;
        }
        int w = a.w(lgvVar.d);
        if (w == 0) {
            w = 1;
        }
        if (w != 1 && w != 2) {
            if (!((jer) ((lsi) this.m).b).g()) {
                ((jol) ((jol) c.f()).j("com/google/android/libraries/notifications/platform/entrypoints/push/PushIntentHandler", "handleSyncInstruction", 373, "PushIntentHandler.java")).r("Received an IN_APP surface instruction, but the in-app push handler is missing.");
                return;
            }
            if (goaVar == null) {
                ((jol) ((jol) c.g()).j("com/google/android/libraries/notifications/platform/entrypoints/push/PushIntentHandler", "handleSyncInstruction", 379, "PushIntentHandler.java")).r("IN_APP sync instructions account must not be null.");
                return;
            }
            try {
                gaw gawVar = (gaw) ((jer) ((lsi) this.m).b).c();
                lgv lgvVar2 = lfsVar.e;
                gpfVar.b();
                gawVar.a().get();
                return;
            } catch (InterruptedException | ExecutionException e) {
                ((jol) ((jol) ((jol) c.g()).i(e)).j("com/google/android/libraries/notifications/platform/entrypoints/push/PushIntentHandler", "handleSyncInstruction", (char) 390, "PushIntentHandler.java")).r("Could not handle in-app sync instruction.");
                return;
            }
        }
        ((dvv) this.a).b();
        ggm ggmVar = (ggm) ((jeu) ((dvv) this.a).b()).a;
        lgv lgvVar3 = lfsVar.e;
        if (lgvVar3 == null) {
            lgvVar3 = lgv.e;
        }
        ggmVar.d(goaVar, lgvVar3, gpfVar.b(), gndVar);
    }
}
