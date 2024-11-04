package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import defpackage.bqc;
import defpackage.bse;
import defpackage.bsg;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public int b;
    public Object c;
    public byte[] d;
    public Parcelable e;
    public int f;
    public int g;
    public ColorStateList h;
    public PorterDuff.Mode i;
    public String j;
    public String k;

    public IconCompat() {
        this.b = -1;
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = a;
        this.j = null;
    }

    public static Resources c(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo == null) {
                return null;
            }
            return packageManager.getResourcesForApplication(applicationInfo);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e);
            return null;
        }
    }

    public static Bitmap d(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat h(Bitmap bitmap) {
        bqc.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.c = bitmap;
        return iconCompat;
    }

    public static IconCompat i(Context context, int i) {
        bqc.c(context);
        return j(context.getResources(), context.getPackageName(), i);
    }

    public static IconCompat j(Resources resources, String str, int i) {
        bqc.c(str);
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f = i;
            if (resources != null) {
                try {
                    iconCompat.c = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.c = str;
            }
            iconCompat.k = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int a() {
        if (this.b == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.c;
            if (Build.VERSION.SDK_INT >= 28) {
                return bsg.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            }
        }
        if (this.b == 2) {
            return this.f;
        }
        toString();
        throw new IllegalStateException("called getResId() on ".concat(toString()));
    }

    public final int b() {
        if (this.b == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.c;
            if (Build.VERSION.SDK_INT >= 28) {
                return bsg.b(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e) {
                Objects.toString(obj);
                Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(obj)), e);
                return -1;
            } catch (NoSuchMethodException e2) {
                Objects.toString(obj);
                Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(obj)), e2);
                return -1;
            } catch (InvocationTargetException e3) {
                Objects.toString(obj);
                Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(obj)), e3);
                return -1;
            }
        }
        return this.b;
    }

    public final Bitmap e() {
        if (this.b == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.c;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        int i = this.b;
        if (i == 1) {
            return (Bitmap) this.c;
        }
        if (i == 5) {
            return d((Bitmap) this.c, true);
        }
        toString();
        throw new IllegalStateException("called getBitmap() on ".concat(toString()));
    }

    public final Icon f(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return bse.b(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public final Uri g() {
        if (this.b == -1 && Build.VERSION.SDK_INT >= 23) {
            return bse.c(this.c);
        }
        int i = this.b;
        if (i != 4 && i != 6) {
            toString();
            throw new IllegalStateException("called getUri() on ".concat(toString()));
        }
        return Uri.parse((String) this.c);
    }

    public final InputStream k(Context context) {
        Uri g = g();
        String scheme = g.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.c));
            } catch (FileNotFoundException e) {
                Objects.toString(g);
                Log.w("IconCompat", "Unable to load image from path: ".concat(String.valueOf(g)), e);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(g);
        } catch (Exception e2) {
            Objects.toString(g);
            Log.w("IconCompat", "Unable to load image from URI: ".concat(String.valueOf(g)), e2);
            return null;
        }
    }

    public final String l() {
        if (this.b == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.c;
            if (Build.VERSION.SDK_INT >= 28) {
                return bsg.d(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon package", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            }
        }
        if (this.b == 2) {
            String str = this.k;
            if (str != null && !TextUtils.isEmpty(str)) {
                return this.k;
            }
            return ((String) this.c).split(":", -1)[0];
        }
        toString();
        throw new IllegalStateException("called getResPackage() on ".concat(toString()));
    }

    public final String toString() {
        String str;
        if (this.b == -1) {
            return String.valueOf(this.c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.b) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.c).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.c).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(a())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f);
                if (this.g != 0) {
                    sb.append(" off=");
                    sb.append(this.g);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.c);
                break;
        }
        if (this.h != null) {
            sb.append(" tint=");
            sb.append(this.h);
        }
        if (this.i != a) {
            sb.append(" mode=");
            sb.append(this.i);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = a;
        this.j = null;
        this.b = i;
    }
}
