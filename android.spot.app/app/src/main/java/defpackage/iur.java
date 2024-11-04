package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class iur extends iut {
    final /* synthetic */ Context a;
    final /* synthetic */ TextPaint b;
    final /* synthetic */ iut c;
    final /* synthetic */ ius d;

    public iur(ius iusVar, Context context, TextPaint textPaint, iut iutVar) {
        this.a = context;
        this.b = textPaint;
        this.c = iutVar;
        this.d = iusVar;
    }

    @Override // defpackage.iut
    public final void a(int i) {
        this.c.a(i);
    }

    @Override // defpackage.iut
    public final void b(Typeface typeface, boolean z) {
        this.d.e(this.a, this.b, typeface);
        this.c.b(typeface, z);
    }
}
