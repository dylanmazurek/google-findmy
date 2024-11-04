package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.adm.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsRequest;
import com.google.ar.core.ImageMetadata;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.util.Objects;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fma {
    private static Context a;
    private static Boolean b;

    public fma() {
    }

    public static void A(Context context) {
        try {
            aR(context);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }

    public static String B(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean C(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static int D(Parcel parcel) {
        return E(parcel, 20293);
    }

    public static int E(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void F(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void G(Parcel parcel, int i, boolean z) {
        ca(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void H(Parcel parcel, int i, byte b2) {
        ca(parcel, i, 4);
        parcel.writeInt(b2);
    }

    public static void I(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                ca(parcel, i, 0);
            }
        } else {
            int E = E(parcel, i);
            parcel.writeByteArray(bArr);
            F(parcel, E);
        }
    }

    public static void J(Parcel parcel, int i, double d) {
        ca(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void K(Parcel parcel, int i, float f) {
        ca(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void L(Parcel parcel, int i, int i2) {
        ca(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void M(Parcel parcel, int i, long j) {
        ca(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void N(Parcel parcel, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        ca(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void O(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int E = E(parcel, i);
        parcel.writeBundle(bundle);
        F(parcel, E);
    }

    public static void P(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int E = E(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        F(parcel, E);
    }

    public static void Q(Parcel parcel, int i, Float f) {
        if (f == null) {
            return;
        }
        ca(parcel, i, 4);
        parcel.writeFloat(f.floatValue());
    }

    public static void R(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int E = E(parcel, i);
        parcel.writeStrongBinder(iBinder);
        F(parcel, E);
    }

    public static void S(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int E = E(parcel, i);
        parcel.writeIntArray(iArr);
        F(parcel, E);
    }

    public static void T(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        ca(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void U(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int E = E(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeLong(((Long) list.get(i2)).longValue());
        }
        F(parcel, E);
    }

    public static void V(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        ca(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static void W(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int E = E(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        F(parcel, E);
    }

    public static void X(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int E = E(parcel, i);
        parcel.writeString(str);
        F(parcel, E);
    }

    public static void Y(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int E = E(parcel, i);
        parcel.writeStringArray(strArr);
        F(parcel, E);
    }

    public static void Z(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int E = E(parcel, i);
        parcel.writeStringList(list);
        F(parcel, E);
    }

    public static int[] aA(Parcel parcel, int i) {
        int ai = ai(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ai == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + ai);
        return createIntArray;
    }

    public static Object[] aB(Parcel parcel, int i, Parcelable.Creator creator) {
        int ai = ai(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ai == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + ai);
        return createTypedArray;
    }

    public static String[] aC(Parcel parcel, int i) {
        int ai = ai(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ai == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + ai);
        return createStringArray;
    }

    public static byte[][] aD(Parcel parcel, int i) {
        int ai = ai(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ai == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + ai);
        return bArr;
    }

    public static String aE(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static void aF(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void aG(boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void aH(boolean z, String str, Object... objArr) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void aI(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + str + ".");
        }
    }

    public static void aJ(String str) {
        if (d()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static void aK() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
    }

    public static void aL() {
        aM("Must not be called on the main application thread");
    }

    public static void aM(String str) {
        if (!d()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static void aN(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void aO(boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void aP(String str) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void aQ(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void aR(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public static void aS(Object obj, Object obj2) {
        if (obj != null) {
        } else {
            throw new NullPointerException((String) obj2);
        }
    }

    public static fxs aT(fhw fhwVar) {
        bym bymVar = new bym((int[]) null);
        fhwVar.d(new flj(fhwVar, bymVar, 0));
        return (fxs) bymVar.a;
    }

    public static String aU(List list, Object obj) {
        StringBuilder sb = new StringBuilder(100);
        sb.append(obj.getClass().getSimpleName());
        sb.append('{');
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static void aV(String str, Object obj, List list) {
        list.add(str + "=" + String.valueOf(obj));
    }

    public static fhn aW(Status status) {
        if (status.i != null) {
            return new fhy(status);
        }
        return new fhn(status);
    }

    public static fjm aX(Object obj, String str) {
        aS(obj, "Listener must not be null");
        aS(str, "Listener type must not be null");
        aQ(str, "Listener type must not be empty");
        return new fjm(obj, str);
    }

    public static fjo aY(Object obj, Looper looper, String str) {
        aS(obj, "Listener must not be null");
        aS(looper, "Looper must not be null");
        aS(str, "Listener type must not be null");
        return new fjo(looper, obj, str);
    }

    public static void aZ(Status status, bym bymVar) {
        ba(status, null, bymVar);
    }

    public static void aa(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int E = E(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                cb(parcel, parcelable, i2);
            }
        }
        F(parcel, E);
    }

    public static void ab(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int E = E(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                cb(parcel, parcelable, 0);
            }
        }
        F(parcel, E);
    }

    public static byte ac(Parcel parcel, int i) {
        cc(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static double ad(Parcel parcel, int i) {
        cc(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float ae(Parcel parcel, int i) {
        cc(parcel, i, 4);
        return parcel.readFloat();
    }

    public static int af(int i) {
        return (char) i;
    }

    public static int ag(Parcel parcel) {
        return parcel.readInt();
    }

    public static int ah(Parcel parcel, int i) {
        cc(parcel, i, 4);
        return parcel.readInt();
    }

    public static int ai(Parcel parcel, int i) {
        if ((i & (-65536)) != -65536) {
            return (char) (i >> 16);
        }
        return parcel.readInt();
    }

    public static int aj(Parcel parcel) {
        int readInt = parcel.readInt();
        int ai = ai(parcel, readInt);
        int af = af(readInt);
        int dataPosition = parcel.dataPosition();
        if (af == 20293) {
            int i = ai + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            throw new flm(a.ad(i, dataPosition, "Size read is invalid start=", " end="), parcel);
        }
        throw new flm("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static long ak(Parcel parcel, int i) {
        cc(parcel, i, 8);
        return parcel.readLong();
    }

    public static Bundle al(Parcel parcel, int i) {
        int ai = ai(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ai == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + ai);
        return readBundle;
    }

    public static IBinder am(Parcel parcel, int i) {
        int ai = ai(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ai == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + ai);
        return readStrongBinder;
    }

    public static Parcelable an(Parcel parcel, int i, Parcelable.Creator creator) {
        int ai = ai(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ai == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + ai);
        return parcelable;
    }

    public static Boolean ao(Parcel parcel, int i) {
        boolean z;
        int ai = ai(parcel, i);
        if (ai == 0) {
            return null;
        }
        cd(parcel, ai, 4);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static Float ap(Parcel parcel, int i) {
        int ai = ai(parcel, i);
        if (ai == 0) {
            return null;
        }
        cd(parcel, ai, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static Integer aq(Parcel parcel, int i) {
        int ai = ai(parcel, i);
        if (ai == 0) {
            return null;
        }
        cd(parcel, ai, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static Long ar(Parcel parcel, int i) {
        int ai = ai(parcel, i);
        if (ai == 0) {
            return null;
        }
        cd(parcel, ai, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static String as(Parcel parcel, int i) {
        int ai = ai(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ai == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + ai);
        return readString;
    }

    public static ArrayList at(Parcel parcel, int i) {
        int ai = ai(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ai == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(dataPosition + ai);
        return arrayList;
    }

    public static ArrayList au(Parcel parcel, int i) {
        int ai = ai(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ai == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + ai);
        return createStringArrayList;
    }

    public static ArrayList av(Parcel parcel, int i, Parcelable.Creator creator) {
        int ai = ai(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ai == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + ai);
        return createTypedArrayList;
    }

    public static void aw(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
        } else {
            throw new flm(a.ae(i, "Overread allowed size end="), parcel);
        }
    }

    public static void ax(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + ai(parcel, i));
    }

    public static boolean ay(Parcel parcel, int i) {
        cc(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static byte[] az(Parcel parcel, int i) {
        int ai = ai(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ai == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + ai);
        return createByteArray;
    }

    public static Set bA(Context context, Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (bz(context, str) != 0) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public static void bB(TextView textView, kvw kvwVar, kvw kvwVar2, int i, ezj ezjVar) {
        int i2;
        int i3 = kvwVar.a;
        Object obj = kvwVar.b;
        if (i != 0) {
            Object obj2 = kvwVar2.b;
            int i4 = kvwVar2.a;
            int i5 = 1;
            if (i == 1) {
                i2 = ((String) obj).indexOf((String) obj2);
            } else if (i == -1) {
                i2 = ((String) obj).lastIndexOf((String) obj2);
            } else {
                String str = (String) obj2;
                String str2 = (String) obj;
                int indexOf = str2.indexOf(str);
                while (true) {
                    if (indexOf >= 0) {
                        if (i5 != 0) {
                            indexOf = str2.indexOf(str, indexOf + 1);
                            i5++;
                        } else {
                            i2 = indexOf;
                            break;
                        }
                    } else {
                        i2 = -1;
                        break;
                    }
                }
            }
            if (i2 == -1) {
                textView.append(cj((String) obj, i3));
                return;
            }
            String str3 = (String) obj2;
            int length = str3.length();
            String str4 = (String) obj;
            textView.append(cj(str4.substring(0, i2), i3));
            Spannable cj = cj(str3, i4);
            ezi eziVar = new ezi(ezjVar);
            int indexOf2 = cj.toString().indexOf(str3);
            cj.setSpan(eziVar, indexOf2, str3.length() + indexOf2, 33);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.append(cj);
            textView.append(cj(str4.substring(i2 + length), i3));
            return;
        }
        textView.append(cj((String) obj, i3));
    }

    public static String bC(Parcel parcel) {
        if (parcel.readInt() > 0) {
            return parcel.readString();
        }
        return null;
    }

    public static void bD(Parcel parcel, lkq lkqVar) {
        byte[] g = lkqVar.g();
        parcel.writeInt(1);
        parcel.writeByteArray(g);
    }

    public static void bE(Parcel parcel, String str) {
        parcel.writeInt(1);
        parcel.writeString(str);
    }

    public static byte[] bF(Parcel parcel) {
        byte[] createByteArray;
        if (parcel.readInt() > 0 && (createByteArray = parcel.createByteArray()) != null) {
            return createByteArray;
        }
        return new byte[0];
    }

    public static PackageInfo bG(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.google.android.apps.adm", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo;
        }
        throw new IllegalStateException("FMD package info null");
    }

    public static String bH(Context context) {
        return bG(context).versionName;
    }

    public static boolean bI(Context context) {
        String bH = bH(context);
        if (bH != null && bH.contains("_df")) {
            return true;
        }
        return false;
    }

    public static boolean bJ(Context context) {
        String bH = bH(context);
        if (bH != null && bH.contains("_staging")) {
            return true;
        }
        return false;
    }

    public static Intent bK(double d, double d2) {
        return new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2));
    }

    public static Drawable bL(Activity activity) {
        return iub.a(activity, new itr(activity, null, 0, R.style.Widget_Fmd_CircularProgressIndicator_DisabledButtonProgressIndicatorStyle));
    }

    public static int bM(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    public static String bN(long j) {
        return DateFormat.getDateInstance().format(new Date(j * 1000));
    }

    public static String bO(Context context, long j, int i, int i2, int i3, int i4, String... strArr) {
        Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        Instant ofEpochMilli2 = Instant.ofEpochMilli(j);
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        if (Duration.between(ofEpochMilli2, ofEpochMilli).compareTo(Duration.ofMinutes(1L)) > 0) {
            if (!cl(ofEpochMilli2, ofEpochMilli)) {
                if (cl(ofEpochMilli2, ofEpochMilli.minus(Duration.ofDays(1L)))) {
                    arrayList.add(0, DateUtils.formatDateTime(context, j, 1));
                    return context.getString(i3, arrayList.toArray());
                }
                arrayList.addAll(0, Arrays.asList(DateUtils.formatDateTime(context, j, ImageMetadata.CONTROL_SCENE_MODE), DateUtils.formatDateTime(context, j, 1)));
                return context.getString(i4, arrayList.toArray());
            }
            arrayList.add(0, DateUtils.formatDateTime(context, j, 1));
            return context.getString(i2, arrayList.toArray());
        }
        return context.getString(i, arrayList.toArray());
    }

    public static boolean bP(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 28 && !networkCapabilities.hasCapability(21)) || !networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16)) {
                return false;
            }
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }

    public static void bQ(Context context, View view, CharSequence charSequence) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.getText().add(charSequence);
            obtain.setEnabled(view.isEnabled());
            obtain.setClassName(view.getClass().getName());
            obtain.setPackageName(context.getPackageName());
            new byr(obtain).a.setSource(view);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    public static void bR(cmd cmdVar, moh mohVar) {
        cmdVar.y(new exz(mohVar));
    }

    public static void bS(mol molVar, abi abiVar, int i) {
        int i2;
        zw zwVar;
        int i3;
        molVar.getClass();
        int i4 = i & 14;
        abi b2 = abiVar.b(1940587983);
        if (i4 == 0) {
            if (true != b2.D(molVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && b2.G()) {
            b2.r();
        } else {
            Context context = (Context) b2.f(AndroidCompositionLocals_androidKt.b);
            if ((((Configuration) b2.f(AndroidCompositionLocals_androidKt.a)).uiMode & 48) == 32) {
                context.getClass();
                if (a.f()) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        long a2 = zv.a.a(context, android.R.color.car_cyan_50);
                        long a3 = zv.a.a(context, android.R.color.car_cyan_500);
                        long a4 = zv.a.a(context, android.R.color.car_cyan_300);
                        long a5 = zv.a.a(context, android.R.color.car_cyan_400);
                        long a6 = zv.a.a(context, android.R.color.car_action1_dark);
                        long a7 = zv.a.a(context, android.R.color.car_cyan_800);
                        long a8 = zv.a.a(context, android.R.color.car_cyan_900);
                        long a9 = zv.a.a(context, android.R.color.car_cyan_600);
                        long a10 = zv.a.a(context, android.R.color.car_cyan_700);
                        long a11 = zv.a.a(context, android.R.color.car_dark_blue_grey_700);
                        long a12 = zv.a.a(context, android.R.color.car_dark_blue_grey_800);
                        long a13 = zv.a.a(context, android.R.color.car_dark_blue_grey_1000);
                        long a14 = zv.a.a(context, android.R.color.car_dark_blue_grey_600);
                        long a15 = zv.a.a(context, android.R.color.car_dark_blue_grey_900);
                        long a16 = zv.a.a(context, android.R.color.car_green_100);
                        long a17 = zv.a.a(context, android.R.color.car_green_200);
                        long a18 = zv.a.a(context, android.R.color.car_green_300);
                        long a19 = zv.a.a(context, android.R.color.car_grey_100);
                        long a20 = zv.a.a(context, android.R.color.car_grey_1000);
                        long a21 = zv.a.a(context, android.R.color.car_blue_900);
                        long a22 = zv.a.a(context, android.R.color.car_blue_grey_800);
                        long a23 = zv.a.a(context, android.R.color.car_grey_200);
                        long a24 = zv.a.a(context, android.R.color.car_keyboard_divider_line);
                        long a25 = zv.a.a(context, android.R.color.car_green_800);
                        long a26 = zv.a.a(context, android.R.color.car_green_900);
                        zwVar = zx.a(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, zv.a.a(context, android.R.color.car_cyan_50), a21, a22, a23, a24, 0L, a25, zv.a.a(context, android.R.color.car_green_500), zv.a.a(context, android.R.color.car_green_600), zv.a.a(context, android.R.color.car_green_700), zv.a.a(context, android.R.color.car_green_400), zv.a.a(context, android.R.color.car_green_50), a26, 331350016);
                    } else {
                        aai d = dc.d(context);
                        long j = d.x;
                        long j2 = d.A;
                        long j3 = d.z;
                        long j4 = d.w;
                        long j5 = d.y;
                        long j6 = d.E;
                        long j7 = d.H;
                        long j8 = d.G;
                        long j9 = d.D;
                        long j10 = d.L;
                        long j11 = d.O;
                        long j12 = d.N;
                        long j13 = d.K;
                        long j14 = d.s;
                        long j15 = d.g;
                        long j16 = d.l;
                        zwVar = zx.a(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j14, j15, j16, d.i, j, j15, d.o, d.j, j16, d.u, d.m, d.q, d.p, d.n, d.r, d.t, j14, 62914560);
                    }
                } else {
                    long j17 = geq.a;
                    long j18 = geq.t;
                    long j19 = geq.j;
                    long j20 = geq.u;
                    long j21 = geq.k;
                    long j22 = geq.e;
                    long j23 = geq.w;
                    long j24 = geq.l;
                    long j25 = geq.x;
                    long j26 = geq.m;
                    long j27 = geq.I;
                    long j28 = geq.p;
                    long j29 = geq.J;
                    long j30 = geq.q;
                    long j31 = geq.a;
                    long j32 = geq.g;
                    long j33 = geq.y;
                    long j34 = geq.n;
                    long j35 = geq.H;
                    long j36 = geq.o;
                    long j37 = geq.f;
                    long j38 = geq.d;
                    zwVar = new zw(j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, geq.G, j37, j38, geq.b, geq.h, geq.c, geq.i, geq.r, geq.s, geq.v, geq.z, geq.F, geq.A, geq.B, geq.C, geq.D, geq.E);
                }
            } else {
                context.getClass();
                if (a.f()) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        long a27 = zv.a.a(context, android.R.color.car_action1_dark);
                        long a28 = zv.a.a(context, android.R.color.car_action1_light);
                        long a29 = zv.a.a(context, android.R.color.car_accent_light);
                        long a30 = zv.a.a(context, android.R.color.car_action1);
                        long a31 = zv.a.a(context, android.R.color.car_cyan_50);
                        long a32 = zv.a.a(context, android.R.color.car_blue_200);
                        long a33 = zv.a.a(context, android.R.color.car_blue_300);
                        long a34 = zv.a.a(context, android.R.color.car_background);
                        long a35 = zv.a.a(context, android.R.color.car_blue_100);
                        long a36 = zv.a.a(context, android.R.color.car_blue_500);
                        long a37 = zv.a.a(context, android.R.color.car_blue_600);
                        long a38 = zv.a.a(context, android.R.color.car_blue_400);
                        long a39 = zv.a.a(context, android.R.color.car_blue_50);
                        long a40 = zv.a.a(context, android.R.color.car_blue_700);
                        long a41 = zv.a.a(context, android.R.color.car_blue_800);
                        long a42 = zv.a.a(context, android.R.color.car_blue_900);
                        long a43 = zv.a.a(context, android.R.color.car_blue_grey_800);
                        long a44 = zv.a.a(context, android.R.color.car_body3);
                        long a45 = zv.a.a(context, android.R.color.car_body3_dark);
                        long a46 = zv.a.a(context, android.R.color.car_green_200);
                        long a47 = zv.a.a(context, android.R.color.car_green_300);
                        long a48 = zv.a.a(context, android.R.color.car_body3_light);
                        long a49 = zv.a.a(context, android.R.color.car_highlight_light);
                        long a50 = zv.a.a(context, android.R.color.car_body2_dark);
                        long a51 = zv.a.a(context, android.R.color.car_body2_light);
                        zwVar = zx.b(a27, a28, a29, a30, a31, a32, a33, a34, a35, a36, a37, a38, a39, a40, a41, a42, a43, a44, a45, zv.a.a(context, android.R.color.car_action1_dark), a46, a47, a48, a49, 0L, a50, zv.a.a(context, android.R.color.car_body1_dark), zv.a.a(context, android.R.color.car_body1_light), zv.a.a(context, android.R.color.car_body2), zv.a.a(context, android.R.color.car_blue_grey_900), zv.a.a(context, android.R.color.car_body1), a51, 331350016, 0);
                    } else {
                        aai d2 = dc.d(context);
                        long j39 = d2.y;
                        long j40 = d2.v;
                        long j41 = d2.w;
                        long j42 = d2.B;
                        long j43 = d2.x;
                        long j44 = d2.F;
                        long j45 = d2.C;
                        long j46 = d2.D;
                        long j47 = d2.I;
                        long j48 = d2.M;
                        long j49 = d2.J;
                        long j50 = d2.K;
                        long j51 = d2.P;
                        long j52 = d2.b;
                        long j53 = d2.r;
                        long j54 = d2.g;
                        zwVar = zx.b(j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51, j52, j53, j52, j53, j54, d2.l, j39, d2.o, d2.d, d2.k, d2.i, d2.u, j52, d2.e, d2.f, j54, d2.c, d2.a, d2.h, 62914560, 0);
                    }
                } else {
                    long j55 = ger.a;
                    long j56 = ger.t;
                    long j57 = ger.j;
                    long j58 = ger.u;
                    long j59 = ger.k;
                    long j60 = ger.e;
                    long j61 = ger.w;
                    long j62 = ger.l;
                    long j63 = ger.x;
                    long j64 = ger.m;
                    long j65 = ger.I;
                    long j66 = ger.p;
                    long j67 = ger.J;
                    long j68 = ger.q;
                    long j69 = ger.a;
                    long j70 = ger.g;
                    long j71 = ger.y;
                    long j72 = ger.n;
                    long j73 = ger.H;
                    long j74 = ger.o;
                    long j75 = ger.f;
                    long j76 = ger.d;
                    zwVar = new zw(j56, j57, j58, j59, j60, j61, j62, j63, j64, j65, j66, j67, j68, j69, j70, j71, j72, j73, j74, ger.G, j75, j76, ger.b, ger.h, ger.c, ger.i, ger.r, ger.s, ger.v, ger.z, ger.F, ger.A, ger.B, ger.C, ger.D, ger.E);
                }
            }
            fzo.i(zwVar, null, null, molVar, b2, (i2 << 9) & 7168);
        }
        afv d3 = b2.d();
        if (d3 != null) {
            ((aeu) d3).d = new bce(molVar, i, 5);
        }
    }

    public static boolean bT(NestedScrollView nestedScrollView) {
        if (nestedScrollView.getChildCount() <= 0 || nestedScrollView.getChildAt(0).getMeasuredHeight() <= nestedScrollView.getHeight() + nestedScrollView.getScrollY()) {
            return false;
        }
        return true;
    }

    public static boolean bU(Context context, String str) {
        try {
            return fyo.c(context.getContentResolver(), str, false);
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static evi bV(String str) {
        str.getClass();
        return new evd(str);
    }

    public static void bW(frm frmVar) {
        ((jni) ((jni) eus.a.e()).j("com/google/android/apps/adm/map/FmdMapsInitializer", "onMapsSdkInitialized", 61, "FmdMapsInitializer.java")).u("Maps SDK initialized with renderer: %s", frmVar);
    }

    public static fdi bX(int i, gok gokVar, fck fckVar) {
        try {
            return cm(fckVar.c.b.getResources().getXml(i), gokVar, fckVar);
        } catch (Resources.NotFoundException e) {
            fckVar.C("inflate() called with unknown resourceId", e);
            return null;
        }
    }

    private static Object bY(fxs fxsVar) {
        if (fxsVar.i()) {
            return fxsVar.e();
        }
        if (fxsVar.g()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(fxsVar.d());
    }

    private static void bZ(fxs fxsVar, fxx fxxVar) {
        fxsVar.o(fxu.b, fxxVar);
        fxsVar.m(fxu.b, fxxVar);
        fxsVar.j(fxu.b, fxxVar);
    }

    public static void ba(Status status, Object obj, bym bymVar) {
        if (status.a()) {
            bymVar.s(obj);
        } else {
            bymVar.r(aW(status));
        }
    }

    public static boolean bb(Status status, Object obj, bym bymVar) {
        if (status.a()) {
            return bymVar.u(obj);
        }
        return bymVar.t(aW(status));
    }

    public static String bc(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return a.ae(i, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static int bd(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 != 0) {
                if (i4 == i) {
                    return i3;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }

    public static int be(int i) {
        int[] y = a.y();
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = y[i2];
            int i4 = i3 - 1;
            if (i3 != 0) {
                if (i4 == i) {
                    return i3;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }

    public static long bf(byte[] bArr) {
        int length = bArr.length;
        int i = 37;
        char c = 0;
        if (length <= 32) {
            if (length <= 16) {
                if (length >= 8) {
                    long j = (length + length) - 7286425919675154353L;
                    long cg = cg(bArr, 0) - 7286425919675154353L;
                    long cg2 = cg(bArr, length - 8);
                    return cf((Long.rotateRight(cg2, 37) * j) + cg, (Long.rotateRight(cg, 25) + cg2) * j, j);
                }
                if (length >= 4) {
                    return cf(length + ((ce(bArr, 0) & 4294967295L) << 3), ce(bArr, length - 4) & 4294967295L, (length + length) - 7286425919675154353L);
                }
                if (length <= 0) {
                    return -7286425919675154353L;
                }
                return (-7286425919675154353L) * ch((((bArr[0] & 255) + ((bArr[length >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((length + ((bArr[length - 1] & 255) << 2)) * (-4348849565147123417L)));
            }
            long cg3 = cg(bArr, 0) * (-5435081209227447693L);
            long cg4 = cg(bArr, 8);
            long j2 = (length + length) - 7286425919675154353L;
            long cg5 = cg(bArr, length - 8) * j2;
            return cf(Long.rotateRight(cg3 + cg4, 43) + Long.rotateRight(cg5, 30) + (cg(bArr, length - 16) * (-7286425919675154353L)), cg3 + Long.rotateRight(cg4 - 7286425919675154353L, 18) + cg5, j2);
        }
        if (length <= 64) {
            long cg6 = cg(bArr, 0) * (-7286425919675154353L);
            long cg7 = cg(bArr, 8);
            long j3 = (length + length) - 7286425919675154353L;
            long cg8 = cg(bArr, length - 8) * j3;
            long cg9 = cg(bArr, length - 16) * (-7286425919675154353L);
            long rotateRight = Long.rotateRight(cg6 + cg7, 43) + Long.rotateRight(cg8, 30);
            long rotateRight2 = Long.rotateRight(cg7 - 7286425919675154353L, 18) + cg6;
            long cg10 = cg(bArr, 16) * j3;
            long cg11 = cg(bArr, 24);
            long j4 = rotateRight + cg9;
            long cg12 = j4 + cg(bArr, length - 32);
            long j5 = cg12 * j3;
            return cf(Long.rotateRight(cg10 + cg11, 43) + Long.rotateRight(j5, 30) + ((cf(j4, rotateRight2 + cg8, j3) + cg(bArr, length - 24)) * j3), cg10 + Long.rotateRight(cg11 + cg6, 18) + j5, j3);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long cg13 = cg(bArr, 0) + 95310865018149119L;
        long ch = ch(-7956866745689871395L) * (-7286425919675154353L);
        long j6 = 2480279821605975764L;
        int i2 = 0;
        while (true) {
            int i3 = length - 1;
            int i4 = (i3 >> 6) * 64;
            long rotateRight3 = Long.rotateRight(cg13 + j6 + jArr[c] + cg(bArr, i2 + 8), i) * (-5435081209227447693L);
            long rotateRight4 = Long.rotateRight(j6 + jArr[1] + cg(bArr, i2 + 48), 42) * (-5435081209227447693L);
            long j7 = rotateRight3 ^ jArr2[1];
            long cg14 = jArr[c] + cg(bArr, i2 + 40);
            long rotateRight5 = Long.rotateRight(ch + jArr2[c], 33) * (-5435081209227447693L);
            ci(bArr, i2, jArr[1] * (-5435081209227447693L), j7 + jArr2[c], jArr);
            long j8 = rotateRight4 + cg14;
            ci(bArr, i2 + 32, rotateRight5 + jArr2[1], cg(bArr, i2 + 16) + j8, jArr2);
            int i5 = i2 + 64;
            if (i5 == i4) {
                int i6 = i3 & 63;
                int i7 = i4 + i6;
                long j9 = j7 & 255;
                long j10 = (j9 + j9) - 5435081209227447693L;
                long j11 = jArr2[0] + i6;
                long j12 = jArr[0] + j11;
                jArr[0] = j12;
                jArr2[0] = j11 + j12;
                long rotateRight6 = Long.rotateRight(rotateRight5 + j8 + j12 + cg(bArr, i7 - 55), 37) * j10;
                long rotateRight7 = Long.rotateRight(j8 + jArr[1] + cg(bArr, i7 - 15), 42) * j10;
                long j13 = jArr2[1] * 9;
                long cg15 = (jArr[0] * 9) + cg(bArr, i7 - 23);
                long rotateRight8 = Long.rotateRight(j7 + jArr2[0], 33) * j10;
                long j14 = rotateRight6 ^ j13;
                ci(bArr, i7 - 63, jArr[1] * j10, j14 + jArr2[0], jArr);
                long j15 = rotateRight7 + cg15;
                ci(bArr, i7 - 31, jArr2[1] + rotateRight8, j15 + cg(bArr, i7 - 47), jArr2);
                return cf(cf(jArr[0], jArr2[0], j10) + (ch(j15) * (-4348849565147123417L)) + j14, cf(jArr[1], jArr2[1], j10) + rotateRight8, j10);
            }
            i2 = i5;
            ch = j7;
            cg13 = rotateRight5;
            c = 0;
            i = 37;
            j6 = j8;
        }
    }

    public static long bg(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static fbt bh(fdn fdnVar, String str) {
        aR(fdnVar);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            Map a2 = flx.a(new URI(a.ao(str, "?")));
            fbt fbtVar = new fbt();
            fbtVar.e = (String) a2.get("utm_content");
            fbtVar.c = (String) a2.get("utm_medium");
            fbtVar.a = (String) a2.get("utm_campaign");
            fbtVar.b = (String) a2.get("utm_source");
            fbtVar.d = (String) a2.get("utm_term");
            fbtVar.f = (String) a2.get("utm_id");
            fbtVar.g = (String) a2.get("anid");
            fbtVar.h = (String) a2.get("gclid");
            fbtVar.i = (String) a2.get("dclid");
            fbtVar.j = (String) a2.get("aclid");
            return fbtVar;
        } catch (URISyntaxException e) {
            fdnVar.C("No valid campaign data found", e);
            return null;
        }
    }

    public static String bi(Locale locale) {
        if (locale != null) {
            String language = locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                StringBuilder sb = new StringBuilder();
                sb.append(language.toLowerCase(locale));
                if (!TextUtils.isEmpty(locale.getCountry())) {
                    sb.append("-");
                    sb.append(locale.getCountry().toLowerCase(locale));
                }
                return sb.toString();
            }
            return null;
        }
        return null;
    }

    public static void bj(Map map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    public static void bk(Map map, String str, Map map2) {
        bj(map, str, (String) map2.get(str));
    }

    public static boolean bl(Context context, String str, boolean z) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                if (z) {
                    if (receiverInfo.exported) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean bm(double d, String str) {
        int i;
        if (d > 0.0d && d < 100.0d) {
            if (!TextUtils.isEmpty(str)) {
                i = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    i = ((i << 6) & 268435455) + charAt + (charAt << 14);
                    int i2 = 266338304 & i;
                    if (i2 != 0) {
                        i ^= i2 >> 21;
                    }
                }
            } else {
                i = 1;
            }
            if (i % 10000 >= d * 100.0d) {
                return true;
            }
        }
        return false;
    }

    public static MessageDigest bn() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static Map bo(Map map, Map map2, List list, List list2) {
        HashMap hashMap = new HashMap(map);
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            hashMap.putAll(((fcg) it.next()).a(bt("&promo", i)));
            i++;
        }
        Iterator it2 = list2.iterator();
        int i2 = 1;
        while (it2.hasNext()) {
            hashMap.putAll(((fcf) it2.next()).a(bt("&pr", i2)));
            i2++;
        }
        int i3 = 1;
        for (Map.Entry entry : map2.entrySet()) {
            List list3 = (List) entry.getValue();
            String bt = bt("&il", i3);
            Iterator it3 = list3.iterator();
            int i4 = 1;
            while (it3.hasNext()) {
                hashMap.putAll(((fcf) it3.next()).a(bt.concat(bu(i4))));
                i4++;
            }
            if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                hashMap.put(bt.concat("nm"), (String) entry.getKey());
            }
            i3++;
        }
        return hashMap;
    }

    public static void bp(String str, String str2, Map map) {
        map.put(str, str2);
    }

    public static void bq(String str, Map map) {
        bp("&ea", str, map);
    }

    public static void br(String str, Map map) {
        bp("&ec", str, map);
    }

    public static void bs(String str, Map map) {
        bp("&el", str, map);
    }

    public static String bt(String str, int i) {
        if (i <= 0) {
            fdm.a("index out of range for prefix", str);
            return "";
        }
        return str + i;
    }

    public static String bu(int i) {
        return bt("pi", i);
    }

    public static void bv(String str) {
        try {
            try {
                frx frxVar = fqu.a;
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        Log.w("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + str);
                    }
                    frx frxVar2 = fqu.a;
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e = e;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                frx frxVar3 = fqu.a;
            } catch (IndexOutOfBoundsException e2) {
                Log.w("HttpUrlPinger", "Error while parsing ping URL: " + str + ". " + e2.getMessage(), e2);
                frx frxVar4 = fqu.a;
            } catch (RuntimeException e3) {
                e = e3;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                frx frxVar32 = fqu.a;
            }
        } catch (Throwable th) {
            frx frxVar5 = fqu.a;
            throw th;
        }
    }

    public static int bw(Activity activity) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        if (Build.VERSION.SDK_INT < 30) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.heightPixels;
        }
        currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        return bounds.bottom - bounds.top;
    }

    public static jer bx(Context context, String str, String str2, lqs lqsVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        lol lolVar = (lol) ezg.a.e(lqsVar);
        int i9 = 4;
        if (lolVar != null && (lolVar.a & 4) != 0 && (i8 = lolVar.d) > 4) {
            i9 = i8;
        }
        if (lolVar != null && (lolVar.a & 2) != 0) {
            i = lolVar.c;
        } else {
            i = 16;
        }
        if (lolVar != null && (lolVar.a & 8) != 0) {
            i2 = lolVar.e;
        } else {
            i2 = 0;
        }
        if (lolVar != null && (16 & lolVar.a) != 0) {
            i3 = lolVar.f;
        } else {
            i3 = 0;
        }
        if (lolVar != null && (lolVar.a & 256) != 0) {
            i4 = lolVar.j;
        } else {
            i4 = 0;
        }
        if (lolVar != null && (lolVar.a & 64) != 0) {
            i5 = lolVar.h;
        } else {
            i5 = 0;
        }
        if (lolVar != null && (lolVar.a & 32) != 0) {
            i6 = lolVar.g;
        } else {
            i6 = 0;
        }
        if (lolVar != null && (lolVar.a & 128) != 0) {
            i7 = lolVar.i;
        } else {
            i7 = 0;
        }
        jer ck = ck(context, str, str2);
        if (!ck.g()) {
            if (str.length() < i9) {
                String string = context.getString(R.string.password_minimum_length, Integer.valueOf(i9));
                fal falVar = new fal();
                falVar.c(string);
                falVar.a = 1;
                return jer.i(falVar.b());
            }
            if (str.length() > i) {
                String string2 = context.getString(R.string.password_maximum_length, Integer.valueOf(i));
                fal falVar2 = new fal();
                falVar2.c(string2);
                falVar2.a = 1;
                return jer.i(falVar2.b());
            }
            for (char c : str.toCharArray()) {
                if (c < ' ' || c > '~') {
                    String string3 = context.getString(R.string.password_invalid_characters);
                    fal falVar3 = new fal();
                    falVar3.c(string3);
                    falVar3.a = 1;
                    return jer.i(falVar3.b());
                }
            }
            if (lolVar != null) {
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                for (char c2 : str.toCharArray()) {
                    if (Character.isLowerCase(c2)) {
                        i11++;
                    }
                    if (Character.isUpperCase(c2)) {
                        i10++;
                    }
                    if (Character.isDigit(c2)) {
                        i12++;
                    }
                }
                int i13 = i10 + i11;
                if (i13 < i2) {
                    String string4 = context.getString(R.string.password_minimum_letter_character, Integer.valueOf(i2));
                    fal falVar4 = new fal();
                    falVar4.c(string4);
                    falVar4.a = 1;
                    return jer.i(falVar4.b());
                }
                if (i11 < i3) {
                    String string5 = context.getString(R.string.password_minimum_lowercase_letter, Integer.valueOf(i3));
                    fal falVar5 = new fal();
                    falVar5.c(string5);
                    falVar5.a = 1;
                    return jer.i(falVar5.b());
                }
                if (i10 < i4) {
                    String string6 = context.getString(R.string.password_minimum_upppercase_letter, Integer.valueOf(i4));
                    fal falVar6 = new fal();
                    falVar6.c(string6);
                    falVar6.a = 1;
                    return jer.i(falVar6.b());
                }
                if (i12 < i5) {
                    String string7 = context.getString(R.string.password_minimum_numeric_character, Integer.valueOf(i5));
                    fal falVar7 = new fal();
                    falVar7.c(string7);
                    falVar7.a = 1;
                    return jer.i(falVar7.b());
                }
                int length = str.length() - i13;
                if (length < i6) {
                    String string8 = context.getString(R.string.password_minimum_non_letter_character, Integer.valueOf(i6));
                    fal falVar8 = new fal();
                    falVar8.c(string8);
                    falVar8.a = 1;
                    return jer.i(falVar8.b());
                }
                if (length - i12 < i7) {
                    String string9 = context.getString(R.string.password_minimum_symbol_character, Integer.valueOf(i7));
                    fal falVar9 = new fal();
                    falVar9.c(string9);
                    falVar9.a = 1;
                    return jer.i(falVar9.b());
                }
            }
            return jdl.a;
        }
        return ck;
    }

    public static jer by(Context context, String str, String str2) {
        jer ck = ck(context, str, str2);
        if (!ck.g()) {
            if (str.length() == 4) {
                for (char c : str.toCharArray()) {
                    if (c >= '0' && c <= '9') {
                    }
                }
                return jdl.a;
            }
            String string = context.getString(R.string.password_not_four_digit);
            fal falVar = new fal();
            falVar.c(string);
            falVar.a = 1;
            return jer.i(falVar.b());
        }
        return ck;
    }

    public static int bz(Context context, String str) {
        try {
            return bqx.b(context, str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static StrictMode.VmPolicy.Builder c(StrictMode.VmPolicy.Builder builder) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        permitUnsafeIntentLaunch = builder.permitUnsafeIntentLaunch();
        return permitUnsafeIntentLaunch;
    }

    private static void ca(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    private static void cb(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    private static void cc(Parcel parcel, int i, int i2) {
        int ai = ai(parcel, i);
        if (ai == i2) {
            return;
        }
        throw new flm("Expected size " + i2 + " got " + ai + " (0x" + Integer.toHexString(ai) + ")", parcel);
    }

    private static void cd(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        throw new flm("Expected size " + i2 + " got " + i + " (0x" + Integer.toHexString(i) + ")", parcel);
    }

    private static int ce(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    private static long cf(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static long cg(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    private static long ch(long j) {
        return j ^ (j >>> 47);
    }

    private static void ci(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long cg = j + cg(bArr, i);
        long cg2 = cg(bArr, i + 8);
        long cg3 = cg(bArr, i + 16);
        long cg4 = cg(bArr, i + 24);
        long j3 = cg2 + cg + cg3;
        long rotateRight = Long.rotateRight(j2 + cg + cg4, 21) + Long.rotateRight(j3, 44);
        jArr[0] = j3 + cg4;
        jArr[1] = rotateRight + cg;
    }

    private static Spannable cj(String str, int i) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, str.length(), 33);
        return spannableString;
    }

    private static jer ck(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            String string = context.getString(R.string.passwords_empty);
            fal falVar = new fal();
            falVar.c(string);
            falVar.a = 1;
            return jer.i(falVar.b());
        }
        if (TextUtils.isEmpty(str2)) {
            String string2 = context.getString(R.string.passwords_empty);
            fal falVar2 = new fal();
            falVar2.c(string2);
            falVar2.a = 2;
            return jer.i(falVar2.b());
        }
        if (!str.equals(str2)) {
            String string3 = context.getString(R.string.passwords_do_not_match);
            fal falVar3 = new fal();
            falVar3.c(string3);
            falVar3.a = 2;
            return jer.i(falVar3.b());
        }
        return jdl.a;
    }

    private static boolean cl(Instant instant, Instant instant2) {
        ZoneId systemDefault = ZoneId.systemDefault();
        LocalDateTime J = instant.atZone(systemDefault).J();
        LocalDateTime J2 = instant2.atZone(systemDefault).J();
        if (J.getYear() == J2.getYear() && J.getMonthValue() == J2.getMonthValue() && J.getDayOfMonth() == J2.getDayOfMonth()) {
            return true;
        }
        return false;
    }

    private static fdi cm(XmlResourceParser xmlResourceParser, gok gokVar, fck fckVar) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.US);
                    if (lowerCase.equals("screenname")) {
                        String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
                        String trim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue)) {
                            TextUtils.isEmpty(trim);
                        }
                    } else if (lowerCase.equals("string")) {
                        String attributeValue2 = xmlResourceParser.getAttributeValue(null, "name");
                        String trim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue2) && trim2 != null) {
                            if ("ga_appName".equals(attributeValue2)) {
                                ((fdi) gokVar.a).a = trim2;
                            } else if ("ga_appVersion".equals(attributeValue2)) {
                                ((fdi) gokVar.a).b = trim2;
                            } else if ("ga_logLevel".equals(attributeValue2)) {
                                ((fdi) gokVar.a).c = trim2;
                            } else {
                                ((fcn) gokVar.b).h().C("String xml configuration name not recognized", attributeValue2);
                            }
                        }
                    } else if (lowerCase.equals("bool")) {
                        String attributeValue3 = xmlResourceParser.getAttributeValue(null, "name");
                        String trim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(trim3)) {
                            try {
                                boolean parseBoolean = Boolean.parseBoolean(trim3);
                                if ("ga_dryRun".equals(attributeValue3)) {
                                    ((fdi) gokVar.a).e = parseBoolean ? 1 : 0;
                                } else {
                                    ((fcn) gokVar.b).h().C("Bool xml configuration name not recognized", attributeValue3);
                                }
                            } catch (NumberFormatException e) {
                                fckVar.D("Error parsing bool configuration value", trim3, e);
                            }
                        }
                    } else if (lowerCase.equals("integer")) {
                        String attributeValue4 = xmlResourceParser.getAttributeValue(null, "name");
                        String trim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(trim4)) {
                            try {
                                int parseInt = Integer.parseInt(trim4);
                                if ("ga_dispatchPeriod".equals(attributeValue4)) {
                                    ((fdi) gokVar.a).d = parseInt;
                                } else {
                                    ((fcn) gokVar.b).h().C("Int xml configuration name not recognized", attributeValue4);
                                }
                            } catch (NumberFormatException e2) {
                                fckVar.D("Error parsing int configuration value", trim4, e2);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e3) {
            fckVar.v("Error parsing tracker configuration file", e3);
        } catch (XmlPullParserException e4) {
            fckVar.v("Error parsing tracker configuration file", e4);
        }
        return (fdi) gokVar.a;
    }

    public static boolean d() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static String e() {
        return System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
    }

    public static synchronized boolean f(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (fma.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool = b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            b = null;
            if (w()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    b = true;
                } catch (ClassNotFoundException unused) {
                    b = false;
                }
            }
            a = applicationContext;
            return b.booleanValue();
        }
    }

    public static void g(ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest) {
        changeFindMyDeviceSettingsRequest.e = true;
    }

    public static long h() {
        if (fzg.a) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.elapsedRealtime() * 1000000;
    }

    public static Instant i() {
        return Instant.now().truncatedTo(ChronoUnit.MILLIS);
    }

    public static Map k(ContentResolver contentResolver, String[] strArr, fyt fytVar) {
        Cursor query = contentResolver.query(fyp.b, null, null, strArr, null);
        try {
            if (query != null) {
                Map a2 = fytVar.a(query.getCount());
                while (query.moveToNext()) {
                    a2.put(query.getString(0), query.getString(1));
                }
                query.close();
                return a2;
            }
            throw new fyu(null);
        } catch (Throwable th) {
            if (query != null) {
                try {
                    query.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Deprecated
    public static fxs l(Executor executor, Callable callable) {
        aS(executor, "Executor must not be null");
        fxv fxvVar = new fxv();
        executor.execute(new fbh(fxvVar, callable, 19));
        return fxvVar;
    }

    public static fxs m() {
        fxv fxvVar = new fxv();
        fxvVar.u();
        return fxvVar;
    }

    public static fxs n(Exception exc) {
        fxv fxvVar = new fxv();
        fxvVar.r(exc);
        return fxvVar;
    }

    public static fxs o(Object obj) {
        fxv fxvVar = new fxv();
        fxvVar.s(obj);
        return fxvVar;
    }

    public static Object p(fxs fxsVar) {
        aL();
        aK();
        if (fxsVar.h()) {
            return bY(fxsVar);
        }
        fxx fxxVar = new fxx();
        bZ(fxsVar, fxxVar);
        fxxVar.a.await();
        return bY(fxsVar);
    }

    public static Object q(fxs fxsVar, long j, TimeUnit timeUnit) {
        aL();
        aK();
        aS(timeUnit, "TimeUnit must not be null");
        if (fxsVar.h()) {
            return bY(fxsVar);
        }
        fxx fxxVar = new fxx();
        bZ(fxsVar, fxxVar);
        if (fxxVar.a.await(j, timeUnit)) {
            return bY(fxsVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static fxs r(fxs fxsVar, TimeUnit timeUnit) {
        aG(true, "Timeout must be positive");
        aS(timeUnit, "TimeUnit must not be null");
        bym bymVar = new bym((int[]) null);
        bym bymVar2 = new bym(bymVar);
        fqw fqwVar = new fqw(Looper.getMainLooper());
        fqwVar.postDelayed(new eta(bymVar2, 18), timeUnit.toMillis(7L));
        fxsVar.k(new fxw(fqwVar, bymVar2, bymVar, 0));
        return (fxs) bymVar2.a;
    }

    public static void s(String str, Object... objArr) {
        Log.e("WakeLock", String.format(str, objArr));
    }

    public static void t(String str, Throwable th) {
        String u = u();
        if (Log.isLoggable(u, 5)) {
            Log.w(u, str, th);
        }
    }

    public static String u() {
        if (Build.VERSION.SDK_INT >= 26) {
            return "PeopleClient";
        }
        return "PeopleClient".substring(0, Math.min(12, 23));
    }

    public static boolean v(Context context) {
        if (fme.b(context).w("com.google.android.providers.gsf.permission.READ_GSERVICES") != 0) {
            return true;
        }
        return fyo.c(context.getContentResolver(), "gms:nearby:requires_gms_check", true);
    }

    public static boolean w() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean x() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public static boolean y() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public static int z(int i) {
        if (i == -1) {
            return -1;
        }
        return i / 1000;
    }

    @Deprecated
    public fhm a(Context context, Looper looper, fkp fkpVar, Object obj, fhr fhrVar, fhs fhsVar) {
        return b(context, looper, fkpVar, obj, fhrVar, fhsVar);
    }

    public fhm b(Context context, Looper looper, fkp fkpVar, Object obj, fiv fivVar, fjr fjrVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public fma(boolean[] zArr) {
    }
}
