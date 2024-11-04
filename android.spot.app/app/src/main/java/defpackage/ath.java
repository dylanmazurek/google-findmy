package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ath extends View {
    public static final /* synthetic */ int h = 0;
    private static final ViewOutlineProvider i = new atg();
    public boolean a;
    public Outline b;
    public boolean c;
    public ble d;
    public bln e;
    public moh f;
    public asq g;
    private final asl j;
    private final bet k;

    public ath(View view, bet betVar, asl aslVar) {
        super(view.getContext());
        this.k = betVar;
        this.j = aslVar;
        setOutlineProvider(i);
        this.c = true;
        this.d = asm.a;
        this.e = bln.Ltr;
        this.f = asr.a;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [aqv, java.lang.Object] */
    @Override // android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        bet betVar = this.k;
        ?? r2 = betVar.a;
        aqo aqoVar = (aqo) r2;
        Canvas canvas2 = aqoVar.a;
        aqoVar.a = canvas;
        ble bleVar = this.d;
        bln blnVar = this.e;
        float width = getWidth();
        float height = getHeight();
        asl aslVar = this.j;
        ask askVar = aslVar.b;
        long k = a.k(width, height);
        asq asqVar = this.g;
        moh mohVar = this.f;
        ble c = askVar.c();
        bln d = aslVar.b.d();
        aqv b = aslVar.b.b();
        long a = aslVar.b.a();
        ask askVar2 = aslVar.b;
        asq asqVar2 = askVar2.a;
        askVar2.f(bleVar);
        askVar2.g(blnVar);
        askVar2.e(r2);
        askVar2.h(k);
        askVar2.a = asqVar;
        r2.e();
        try {
            mohVar.a(aslVar);
            r2.d();
            ask askVar3 = aslVar.b;
            askVar3.f(c);
            askVar3.g(d);
            askVar3.e(b);
            askVar3.h(a);
            askVar3.a = asqVar2;
            ((aqo) betVar.a).a = canvas2;
            this.a = false;
        } catch (Throwable th) {
            r2.d();
            ask askVar4 = aslVar.b;
            askVar4.f(c);
            askVar4.g(d);
            askVar4.e(b);
            askVar4.h(a);
            askVar4.a = asqVar2;
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.c;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (!this.a) {
            this.a = true;
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }
}
