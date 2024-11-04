package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gzi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public gzi(es esVar, List list, List list2, int i, int i2) {
        this.e = i2;
        this.b = esVar;
        this.d = list;
        this.c = list2;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                hjh hjhVar = ((hjg) this.c).e;
                hjhVar.a.x((View) this.b, this.a, this.d);
                return;
            }
            ((es) this.b).b.execute(new bx(this, fe.a(new er(this)), 4, (char[]) null));
            return;
        }
        Object obj = this.d;
        nhc nhcVar = (nhc) this.b;
        gzj gzjVar = new gzj(nhcVar, (String) obj);
        gzg gzgVar = (gzg) this.c;
        frx frxVar = gzgVar.b;
        Object obj2 = nhcVar.d;
        int i2 = this.a;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        hit a = hit.a(obj2);
        hwx.K(z, "Size must be bigger or equal to 0");
        hwx.K(hnu.c(a), "handles(key) must be true");
        ArrayList arrayList = new ArrayList();
        String str = a.b;
        hnu hnuVar = gzgVar.a;
        if (str != null) {
            arrayList.add(str);
        }
        if (i2 == 0) {
            i2 = 120;
        }
        arrayList.add(a.a);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        imz imzVar = new imz(new ina(((Context) hnuVar.a).getApplicationContext(), new jxw()));
        int[] iArr = imy.a;
        imz imzVar2 = new imz(imzVar);
        hzt hztVar = inb.a;
        imzVar2.b(null);
        imz.a(null);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        int a2 = imz.a(a.a);
        CharSequence b = imzVar2.b(new njz(strArr));
        Canvas canvas = new Canvas(createBitmap);
        int height = createBitmap.getHeight();
        int width = createBitmap.getWidth();
        Paint paint = (Paint) inb.a.a();
        synchronized (inb.a) {
            paint.setColor(a2);
            int height2 = canvas.getHeight();
            int width2 = canvas.getWidth();
            canvas.drawCircle(width2 / 2, height2 / 2, Math.min(width2, height2) / 2, paint);
            if (b != null) {
                paint.setColor(-1);
                paint.setTextSize(Math.min(height, width) * 0.47f);
                paint.getTextBounds(b.toString(), 0, b.length(), inb.b);
                canvas.drawText(b, 0, b.length(), width / 2, (height / 2) - inb.b.exactCenterY(), paint);
            }
        }
        nhc nhcVar2 = gzjVar.b;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(nhcVar2.f(createBitmap));
        gzm.b.put(gzjVar.a, bitmapDrawable);
        nhcVar2.j(bitmapDrawable, true);
    }

    public /* synthetic */ gzi(hjg hjgVar, View view, int i, Object obj, int i2) {
        this.e = i2;
        this.c = hjgVar;
        this.b = view;
        this.a = i;
        this.d = obj;
    }

    public /* synthetic */ gzi(nhc nhcVar, his hisVar, int i, String str, int i2) {
        this.e = i2;
        this.b = nhcVar;
        this.c = hisVar;
        this.a = i;
        this.d = str;
    }
}
