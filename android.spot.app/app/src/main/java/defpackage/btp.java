package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btp {
    public static final sn a = new sn(16);
    public static final ExecutorService b;
    public static final Object c;
    public static final ta d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new hgy(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new ta();
    }

    public static String a(btl btlVar, int i) {
        return btlVar.f + "-" + i;
    }

    /* JADX WARN: Finally extract failed */
    public static kvw b(String str, Context context, btl btlVar, int i) {
        int i2;
        PackageManager packageManager;
        Resources resources;
        String str2;
        ProviderInfo resolveContentProvider;
        Cursor cursor;
        btj btjVar;
        btq[] btqVarArr;
        int i3;
        int i4;
        Uri withAppendedId;
        int i5;
        boolean z;
        int length;
        Typeface typeface = (Typeface) a.b(str);
        if (typeface == null) {
            int i6 = -1;
            try {
                packageManager = context.getPackageManager();
                resources = context.getResources();
                str2 = btlVar.a;
                resolveContentProvider = packageManager.resolveContentProvider(str2, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                i2 = -1;
            }
            if (resolveContentProvider != null) {
                if (resolveContentProvider.packageName.equals(btlVar.b)) {
                    Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        arrayList.add(signature.toByteArray());
                    }
                    Collections.sort(arrayList, btk.a);
                    List list = btlVar.d;
                    if (list == null) {
                        list = bpe.d(resources, btlVar.e);
                    }
                    int i7 = 0;
                    loop1: while (true) {
                        cursor = null;
                        btqVarArr = null;
                        if (i7 < list.size()) {
                            ArrayList arrayList2 = new ArrayList((Collection) list.get(i7));
                            Collections.sort(arrayList2, btk.a);
                            if (arrayList.size() == arrayList2.size()) {
                                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                    if (Arrays.equals((byte[]) arrayList.get(i8), (byte[]) arrayList2.get(i8))) {
                                    }
                                }
                                break loop1;
                            }
                            i7++;
                        } else {
                            resolveContentProvider = null;
                            break;
                        }
                    }
                    boolean z2 = true;
                    if (resolveContentProvider == null) {
                        i2 = 1;
                    } else {
                        String str3 = resolveContentProvider.authority;
                        ArrayList arrayList3 = new ArrayList();
                        Uri build = new Uri.Builder().scheme("content").authority(str3).build();
                        Uri build2 = new Uri.Builder().scheme("content").authority(str3).appendPath("file").build();
                        if (Build.VERSION.SDK_INT < 24) {
                            btjVar = new btj(context, build, 1, null);
                        } else {
                            btjVar = new btj(context, build, 0);
                        }
                        try {
                            cursor = btjVar.b(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, new String[]{btlVar.c});
                            if (cursor != null && cursor.getCount() > 0) {
                                int columnIndex = cursor.getColumnIndex("result_code");
                                arrayList3 = new ArrayList();
                                int columnIndex2 = cursor.getColumnIndex("_id");
                                int columnIndex3 = cursor.getColumnIndex("file_id");
                                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                                int columnIndex5 = cursor.getColumnIndex("font_weight");
                                int columnIndex6 = cursor.getColumnIndex("font_italic");
                                while (cursor.moveToNext()) {
                                    if (columnIndex != i6) {
                                        i3 = cursor.getInt(columnIndex);
                                    } else {
                                        i3 = 0;
                                    }
                                    if (columnIndex4 != i6) {
                                        i4 = cursor.getInt(columnIndex4);
                                    } else {
                                        i4 = 0;
                                    }
                                    if (columnIndex3 == i6) {
                                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                                    } else {
                                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                                    }
                                    Uri uri = withAppendedId;
                                    if (columnIndex5 != -1) {
                                        i5 = cursor.getInt(columnIndex5);
                                    } else {
                                        i5 = 400;
                                    }
                                    if (columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1) {
                                        z = true;
                                        arrayList3.add(new btq(uri, i4, i5, z, i3));
                                        i6 = -1;
                                    }
                                    z = false;
                                    arrayList3.add(new btq(uri, i4, i5, z, i3));
                                    i6 = -1;
                                }
                            }
                            i2 = 1;
                            if (cursor != null) {
                                cursor.close();
                            }
                            btjVar.a();
                            btqVarArr = (btq[]) arrayList3.toArray(new btq[0]);
                            z2 = false;
                        } catch (Throwable th) {
                            if (cursor != null) {
                                cursor.close();
                            }
                            btjVar.a();
                            throw th;
                        }
                    }
                    if (z2) {
                        i2 = -2;
                    } else if (btqVarArr != null && (length = btqVarArr.length) != 0) {
                        int i9 = 0;
                        while (true) {
                            if (i9 < length) {
                                i2 = btqVarArr[i9].e;
                                if (i2 != 0) {
                                    if (i2 < 0) {
                                        i2 = -3;
                                    }
                                } else {
                                    i9++;
                                }
                            } else {
                                i2 = 0;
                                break;
                            }
                        }
                    }
                    if (i2 == 0) {
                        Typeface a2 = brt.a.a(context, btqVarArr, i);
                        if (a2 == null) {
                            i2 = -3;
                        } else {
                            a.c(str, a2);
                            return new kvw(a2);
                        }
                    }
                    return new kvw(i2);
                }
                throw new PackageManager.NameNotFoundException("Found content provider " + str2 + ", but package was not " + btlVar.b);
            }
            throw new PackageManager.NameNotFoundException("No package found for authority: ".concat(str2));
        }
        return new kvw(typeface);
    }
}
