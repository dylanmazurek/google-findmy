package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class maf {
    public Object a;
    public final Object b;
    public Object c;

    public maf(ag agVar) {
        this.b = agVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g(final float r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L1c
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L11
            goto L2a
        L11:
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L1c
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = defpackage.hzc.X(r0)
            goto L2a
        L1c:
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r2 = defpackage.hzc.N(r0)
        L2a:
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            java.lang.String r2 = (java.lang.String) r2
            if (r0 <= 0) goto L7b
            java.lang.Object r0 = r7.c
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L3e
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            goto L55
        L3e:
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
        L44:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L51
            r0.next()
            r5 = 1
            long r3 = r3 + r5
            goto L44
        L51:
            int r0 = defpackage.iqh.o(r3)
        L55:
            r1 = 1
            if (r0 > r1) goto L59
            goto L7b
        L59:
            java.lang.Object r0 = r7.b
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.text.TextPaint r0 = r0.getPaint()
            java.lang.Object r1 = r7.c
            hhe r3 = new hhe
            r3.<init>()
            jer r8 = defpackage.hzc.U(r1, r3)
            jer r0 = defpackage.jer.h(r2)
            jer r8 = r8.a(r0)
            java.lang.Object r8 = r8.f()
            r2 = r8
            java.lang.String r2 = (java.lang.String) r2
        L7b:
            if (r2 == 0) goto L8d
            java.lang.Object r8 = r7.b
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.CharSequence r8 = r8.getText()
            boolean r8 = r2.contentEquals(r8)
            if (r8 != 0) goto L8c
            goto L8d
        L8c:
            return
        L8d:
            java.lang.Object r8 = r7.b
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setText(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.maf.g(float):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    public final mah a() {
        return new mah(this.a, (lyp) this.b, (Object[][]) this.c);
    }

    public final void b(List list) {
        hwx.K(!list.isEmpty(), "addrs is empty");
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    public final void c(jis jisVar) {
        this.c = hzc.V(jisVar, new eja(6));
        if (((jer) this.a).g()) {
            g(((Float) ((jer) this.a).c()).floatValue());
        }
    }

    public final void d(int i) {
        float f;
        Object obj = this.b;
        TextView textView = (TextView) obj;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        View view = (View) textView.getParent();
        float paddingLeft = view.getPaddingLeft() + view.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + textView.getPaddingLeft() + textView.getPaddingRight();
        if (obj instanceof Chip) {
            ipu ipuVar = ((Chip) obj).e;
            float f2 = 0.0f;
            if (ipuVar != null) {
                f = ipuVar.h;
            } else {
                f = 0.0f;
            }
            if (ipuVar != null) {
                f2 = ipuVar.i;
            }
            paddingLeft += f + f2;
        }
        float f3 = i - paddingLeft;
        if (((jer) this.a).g() && f3 == ((Float) ((jer) this.a).c()).floatValue()) {
            return;
        }
        this.a = jer.i(Float.valueOf(f3));
        g(f3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [cfc, java.lang.Object] */
    public final void e(exr exrVar) {
        int i = 12;
        this.a = ((ag) this.b).L(new pp(), new dyd(exrVar, i));
        this.c = exrVar;
        ((ag) this.b).G().Q("NOTIFICATION_PERMISSION_RESULT_FRAGMENT_RESULT", this.b, new ehe(this, i));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, exr] */
    public final void f(int i) {
        this.a.getClass();
        Context x = ((ag) this.b).x();
        if (Build.VERSION.SDK_INT >= 33 && x != null && bqx.b(x, "android.permission.POST_NOTIFICATIONS") != 0) {
            if (((ag) this.b).az("android.permission.POST_NOTIFICATIONS")) {
                exs exsVar = new exs();
                Bundle bundle = new Bundle();
                bundle.putInt("DIALOG_BODY_STRING_KEY", i);
                exsVar.ak(bundle);
                exsVar.cs(((ag) this.b).G(), "NOTIFICATION_PERMISSION_PROMPT_FRAGMENT_TAG");
                return;
            }
            Object obj = this.a;
            obj.getClass();
            ((pf) obj).b("android.permission.POST_NOTIFICATIONS");
            return;
        }
        ?? r4 = this.c;
        r4.getClass();
        r4.a();
    }

    public maf(qi qiVar) {
        this.b = qiVar;
    }

    public maf(byte[] bArr) {
        this.b = new jw();
    }

    public maf(TextView textView) {
        this.a = jdl.a;
        int i = jis.d;
        this.c = jmi.a;
        this.b = textView;
    }

    public maf() {
        this.b = lyp.a;
        this.c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
    }
}
