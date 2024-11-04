package defpackage;

import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class api {
    public static final api a = new api();

    private api() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:            r3 = r3.getText();     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:            r3 = r3.getValue("android:text");     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.apk r5, android.util.LongSparseArray r6) {
        /*
            bud r0 = new bud
            r0.<init>(r6)
        L5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5c
            long r1 = r0.a()
            java.lang.Object r3 = r6.get(r1)
            android.view.translation.ViewTranslationResponse r3 = defpackage.api$$ExternalSyntheticApiModelOutline0.m15m(r3)
            if (r3 == 0) goto L5
            java.lang.String r4 = "android:text"
            android.view.translation.TranslationResponseValue r3 = defpackage.api$$ExternalSyntheticApiModelOutline0.m(r3, r4)
            if (r3 == 0) goto L5
            java.lang.CharSequence r3 = defpackage.api$$ExternalSyntheticApiModelOutline0.m(r3)
            if (r3 == 0) goto L5
            se r4 = r5.g()
            int r2 = (int) r1
            java.lang.Object r1 = r4.a(r2)
            bfi r1 = (defpackage.bfi) r1
            if (r1 == 0) goto L5
            java.lang.Object r1 = r1.a
            if (r1 == 0) goto L5
            bfn r2 = defpackage.bfd.a
            bfh r1 = (defpackage.bfh) r1
            bfe r1 = r1.c
            bfn r2 = defpackage.bfd.i
            java.lang.Object r1 = defpackage.bej.b(r1, r2)
            bev r1 = (defpackage.bev) r1
            if (r1 == 0) goto L5
            mkq r1 = r1.a
            moh r1 = (defpackage.moh) r1
            bfs r2 = new bfs
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            java.lang.Object r1 = r1.a(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L5
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.api.c(apk, android.util.LongSparseArray):void");
    }

    public final void a(apk apkVar, long[] jArr, int[] iArr, Consumer consumer) {
        Object obj;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        for (long j : jArr) {
            bfi bfiVar = (bfi) apkVar.g().a((int) j);
            if (bfiVar != null && (obj = bfiVar.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(apkVar.a.getAutofillId(), r1.e);
                bfn bfnVar = bfj.a;
                List list = (List) bej.b(((bfh) obj).c, bfj.s);
                if (list != null) {
                    forText = TranslationRequestValue.forText(new bfs(beh.d(list, "\n")));
                    builder.setValue("android:text", forText);
                    build = builder.build();
                    consumer.accept(build);
                }
            }
        }
    }

    public final void b(apk apkVar, LongSparseArray longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (amr.i(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            c(apkVar, longSparseArray);
        } else {
            apkVar.a.post(new bx(apkVar, longSparseArray, 9));
        }
    }
}
