package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.adm.R;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bps {
    protected bpm a;
    public CharSequence b;

    private final Bitmap f(IconCompat iconCompat, int i, int i2) {
        Drawable drawable;
        BitmapDrawable bitmapDrawable;
        Drawable a;
        BitmapDrawable bitmapDrawable2;
        int i3;
        Object obj;
        int identifier;
        Context context = this.a.a;
        if (iconCompat.b == 2 && (obj = iconCompat.c) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if (!"0_resource_name_obfuscated".equals(str4) && iconCompat.f != (identifier = IconCompat.c(context, iconCompat.l()).getIdentifier(str4, str3, str5))) {
                    iconCompat.f = identifier;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            drawable = bse.a(iconCompat.f(context), context);
        } else {
            Drawable drawable2 = null;
            switch (iconCompat.b) {
                case 1:
                    bitmapDrawable = new BitmapDrawable(context.getResources(), (Bitmap) iconCompat.c);
                    drawable2 = bitmapDrawable;
                    break;
                case 2:
                    String l = iconCompat.l();
                    if (TextUtils.isEmpty(l)) {
                        l = context.getPackageName();
                    }
                    try {
                        a = brg.a(IconCompat.c(context, l), iconCompat.f, context.getTheme());
                        drawable2 = a;
                        break;
                    } catch (RuntimeException e) {
                        Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(iconCompat.f), iconCompat.c), e);
                        break;
                    }
                case 3:
                    bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) iconCompat.c, iconCompat.f, iconCompat.g));
                    drawable2 = bitmapDrawable;
                    break;
                case 4:
                    InputStream k = iconCompat.k(context);
                    if (k != null) {
                        bitmapDrawable2 = new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(k));
                        drawable2 = bitmapDrawable2;
                        break;
                    }
                    break;
                case 5:
                    bitmapDrawable = new BitmapDrawable(context.getResources(), IconCompat.d((Bitmap) iconCompat.c, false));
                    drawable2 = bitmapDrawable;
                    break;
                case 6:
                    InputStream k2 = iconCompat.k(context);
                    if (k2 != null) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            a = bsf.a(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(k2)));
                            drawable2 = a;
                            break;
                        } else {
                            bitmapDrawable2 = new BitmapDrawable(context.getResources(), IconCompat.d(BitmapFactory.decodeStream(k2), false));
                            drawable2 = bitmapDrawable2;
                            break;
                        }
                    }
                    break;
            }
            if (drawable2 != null && (iconCompat.h != null || iconCompat.i != IconCompat.a)) {
                drawable2.mutate();
                bsc.g(drawable2, iconCompat.h);
                bsc.h(drawable2, iconCompat.i);
            }
            drawable = drawable2;
        }
        if (i2 == 0) {
            i3 = drawable.getIntrinsicWidth();
            i2 = 0;
        } else {
            i3 = i2;
        }
        if (i2 == 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, i3, i2);
        if (i != 0) {
            drawable.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        drawable.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    protected String a() {
        throw null;
    }

    public void b(bqb bqbVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bitmap g(IconCompat iconCompat, int i) {
        return f(iconCompat, i, 0);
    }

    public final Bitmap h(int i, int i2, int i3, int i4) {
        IconCompat i5 = IconCompat.i(this.a.a, R.drawable.notification_icon_background);
        if (i4 == 0) {
            i4 = 0;
        }
        Bitmap f = f(i5, i4, i2);
        Canvas canvas = new Canvas(f);
        Drawable mutate = this.a.a.getResources().getDrawable(i).mutate();
        mutate.setFilterBitmap(true);
        int i6 = (i2 - i3) / 2;
        int i7 = i3 + i6;
        mutate.setBounds(i6, i6, i7, i7);
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        mutate.draw(canvas);
        return f;
    }

    public void i(Bundle bundle) {
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        bundle.putString("android.support.v4.app.extra.COMPAT_TEMPLATE", a());
    }

    public RemoteViews j() {
        return null;
    }

    public void e() {
    }
}
