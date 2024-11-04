package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bke extends TextPaint {
    public int a;
    private bkv b;
    private arl c;
    private aqs d;
    private kv e;

    public bke(float f) {
        super(1);
        this.density = f;
        this.b = bkv.a;
        this.a = 3;
        this.c = arl.a;
    }

    public final void a() {
        setShader(null);
    }

    public final void b(int i) {
        if (!a.m(i, this.a)) {
            aqs aqsVar = this.d;
            if (aqsVar == null) {
                aqsVar = new aqs(this);
                this.d = aqsVar;
            }
            aqsVar.d(i);
            this.a = i;
        }
    }

    public final void c(long j) {
        if (j != 16) {
            setColor(jw.d(j));
            a();
        }
    }

    public final void d(arl arlVar) {
        if (arlVar != null && !amr.i(this.c, arlVar)) {
            this.c = arlVar;
            if (amr.i(arlVar, arl.a)) {
                clearShadowLayer();
                return;
            }
            arl arlVar2 = this.c;
            float f = arlVar2.d;
            long j = arlVar2.c;
            float b = aqk.b(0L);
            long j2 = this.c.c;
            setShadowLayer(Float.MIN_VALUE, b, aqk.c(0L), jw.d(this.c.b));
        }
    }

    public final void e(bkv bkvVar) {
        if (bkvVar != null && !amr.i(this.b, bkvVar)) {
            this.b = bkvVar;
            setUnderlineText(bkvVar.a(bkv.b));
            setStrikeThruText(this.b.a(bkv.c));
        }
    }

    public final void f(kv kvVar) {
        if (kvVar != null && !amr.i(this.e, kvVar)) {
            this.e = kvVar;
            if (amr.i(kvVar, asp.a)) {
                setStyle(Paint.Style.FILL);
            }
        }
    }
}
