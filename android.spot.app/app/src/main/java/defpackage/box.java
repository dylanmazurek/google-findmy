package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class box {
    static void a(Object obj) {
        fr$$ExternalSyntheticApiModelOutline0.m(obj).onSharedElementsReady();
    }

    public static void b(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }

    public static boolean c(Activity activity, String str) {
        boolean shouldShowRequestPermissionRationale;
        shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
        return shouldShowRequestPermissionRationale;
    }

    public static Intent d(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String f = f(activity);
        if (f == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, f);
        try {
            if (g(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", a.ag(f, "getParentActivityIntent: bad parentActivityName '", "' in manifest"));
            return null;
        }
    }

    public static Intent e(Context context, ComponentName componentName) {
        String g = g(context, componentName);
        if (g == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), g);
        if (g(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String f(Activity activity) {
        try {
            return g(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String g(Context context, ComponentName componentName) {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i = 269222528;
        } else if (Build.VERSION.SDK_INT >= 24) {
            i = 787072;
        } else {
            i = 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return String.valueOf(context.getPackageName()).concat(string);
        }
        return string;
    }

    public static final byte[] h(cpn cpnVar) {
        int i;
        String str;
        Double d;
        double d2;
        Float f;
        float f2;
        Long l;
        long j;
        Integer num;
        int i2;
        Byte b;
        byte b2;
        Boolean bool;
        boolean z;
        cpnVar.getClass();
        int i3 = 0;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                int i4 = 1;
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(cpnVar.b.size());
                for (Map.Entry entry : cpnVar.b.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        dataOutputStream.writeByte(i3);
                    } else if (value instanceof Boolean) {
                        dataOutputStream.writeByte(i4);
                        dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                    } else if (value instanceof Byte) {
                        dataOutputStream.writeByte(2);
                        dataOutputStream.writeByte(((Number) value).byteValue());
                    } else if (value instanceof Integer) {
                        dataOutputStream.writeByte(3);
                        dataOutputStream.writeInt(((Number) value).intValue());
                    } else if (value instanceof Long) {
                        dataOutputStream.writeByte(4);
                        dataOutputStream.writeLong(((Number) value).longValue());
                    } else if (value instanceof Float) {
                        dataOutputStream.writeByte(5);
                        dataOutputStream.writeFloat(((Number) value).floatValue());
                    } else if (value instanceof Double) {
                        dataOutputStream.writeByte(6);
                        dataOutputStream.writeDouble(((Number) value).doubleValue());
                    } else if (value instanceof String) {
                        dataOutputStream.writeByte(7);
                        dataOutputStream.writeUTF((String) value);
                    } else if (value instanceof Object[]) {
                        Object[] objArr = (Object[]) value;
                        Class<?> cls = objArr.getClass();
                        int i5 = mpo.a;
                        mox moxVar = new mox(cls);
                        int i6 = 11;
                        int i7 = 10;
                        int i8 = 8;
                        if (amr.i(moxVar, new mox(Boolean[].class))) {
                            i = 8;
                        } else if (amr.i(moxVar, new mox(Byte[].class))) {
                            i = 9;
                        } else if (amr.i(moxVar, new mox(Integer[].class))) {
                            i = 10;
                        } else if (amr.i(moxVar, new mox(Long[].class))) {
                            i = 11;
                        } else if (amr.i(moxVar, new mox(Float[].class))) {
                            i = 12;
                        } else if (amr.i(moxVar, new mox(Double[].class))) {
                            i = 13;
                        } else if (amr.i(moxVar, new mox(String[].class))) {
                            i = 14;
                        } else {
                            throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(new mox(objArr.getClass()).b())));
                        }
                        dataOutputStream.writeByte(i);
                        int length = objArr.length;
                        dataOutputStream.writeInt(length);
                        int i9 = 0;
                        while (i9 < length) {
                            Object obj = objArr[i9];
                            if (i == i8) {
                                if (obj instanceof Boolean) {
                                    bool = (Boolean) obj;
                                } else {
                                    bool = null;
                                }
                                if (bool != null) {
                                    z = bool.booleanValue();
                                } else {
                                    z = false;
                                }
                                dataOutputStream.writeBoolean(z);
                            } else if (i == 9) {
                                if (obj instanceof Byte) {
                                    b = (Byte) obj;
                                } else {
                                    b = null;
                                }
                                if (b != null) {
                                    b2 = b.byteValue();
                                } else {
                                    b2 = 0;
                                }
                                dataOutputStream.writeByte(b2);
                            } else if (i == i7) {
                                if (obj instanceof Integer) {
                                    num = (Integer) obj;
                                } else {
                                    num = null;
                                }
                                if (num != null) {
                                    i2 = num.intValue();
                                } else {
                                    i2 = 0;
                                }
                                dataOutputStream.writeInt(i2);
                            } else if (i == i6) {
                                if (obj instanceof Long) {
                                    l = (Long) obj;
                                } else {
                                    l = null;
                                }
                                if (l != null) {
                                    j = l.longValue();
                                } else {
                                    j = 0;
                                }
                                dataOutputStream.writeLong(j);
                            } else if (i == 12) {
                                if (obj instanceof Float) {
                                    f = (Float) obj;
                                } else {
                                    f = null;
                                }
                                if (f != null) {
                                    f2 = f.floatValue();
                                } else {
                                    f2 = 0.0f;
                                }
                                dataOutputStream.writeFloat(f2);
                            } else if (i == 13) {
                                if (obj instanceof Double) {
                                    d = (Double) obj;
                                } else {
                                    d = null;
                                }
                                if (d != null) {
                                    d2 = d.doubleValue();
                                } else {
                                    d2 = 0.0d;
                                }
                                dataOutputStream.writeDouble(d2);
                            } else {
                                if (obj instanceof String) {
                                    str = (String) obj;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                                }
                                dataOutputStream.writeUTF(str);
                            }
                            i9++;
                            i8 = 8;
                            i6 = 11;
                            i7 = 10;
                        }
                    } else {
                        Class<?> cls2 = value.getClass();
                        int i10 = mpo.a;
                        throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(new mox(cls2).c())));
                    }
                    dataOutputStream.writeUTF(str2);
                    i3 = 0;
                    i4 = 1;
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() <= 10240) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    mjo.r(dataOutputStream, null);
                    byteArray.getClass();
                    return byteArray;
                }
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            } finally {
            }
        } catch (IOException e) {
            String str3 = cpo.a;
            cqc.b();
            Log.e(str3, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    public static final cpn i(Map map) {
        cpn cpnVar = new cpn(map);
        h(cpnVar);
        return cpnVar;
    }

    public static final void j(cpn cpnVar, Map map) {
        cpnVar.getClass();
        k(cpnVar.b, map);
    }

    public static final void k(Map map, Map map2) {
        Object[] objArr;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            if (value == null) {
                value = null;
            } else {
                int i = mpo.a;
                mox moxVar = new mox(value.getClass());
                if (!amr.i(moxVar, new mox(Boolean.TYPE)) && !amr.i(moxVar, new mox(Byte.TYPE)) && !amr.i(moxVar, new mox(Integer.TYPE)) && !amr.i(moxVar, new mox(Long.TYPE)) && !amr.i(moxVar, new mox(Float.TYPE)) && !amr.i(moxVar, new mox(Double.TYPE)) && !amr.i(moxVar, new mox(String.class)) && !amr.i(moxVar, new mox(Boolean[].class)) && !amr.i(moxVar, new mox(Byte[].class)) && !amr.i(moxVar, new mox(Integer[].class)) && !amr.i(moxVar, new mox(Long[].class)) && !amr.i(moxVar, new mox(Float[].class)) && !amr.i(moxVar, new mox(Double[].class)) && !amr.i(moxVar, new mox(String[].class))) {
                    int i2 = 0;
                    if (amr.i(moxVar, new mox(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        int length = zArr.length;
                        String str2 = cpo.a;
                        objArr = new Boolean[length];
                        while (i2 < length) {
                            objArr[i2] = Boolean.valueOf(zArr[i2]);
                            i2++;
                        }
                    } else if (amr.i(moxVar, new mox(byte[].class))) {
                        value = cpo.a((byte[]) value);
                    } else if (amr.i(moxVar, new mox(int[].class))) {
                        int[] iArr = (int[]) value;
                        int length2 = iArr.length;
                        String str3 = cpo.a;
                        objArr = new Integer[length2];
                        while (i2 < length2) {
                            objArr[i2] = Integer.valueOf(iArr[i2]);
                            i2++;
                        }
                    } else if (amr.i(moxVar, new mox(long[].class))) {
                        long[] jArr = (long[]) value;
                        int length3 = jArr.length;
                        String str4 = cpo.a;
                        objArr = new Long[length3];
                        while (i2 < length3) {
                            objArr[i2] = Long.valueOf(jArr[i2]);
                            i2++;
                        }
                    } else if (amr.i(moxVar, new mox(float[].class))) {
                        float[] fArr = (float[]) value;
                        int length4 = fArr.length;
                        String str5 = cpo.a;
                        objArr = new Float[length4];
                        while (i2 < length4) {
                            objArr[i2] = Float.valueOf(fArr[i2]);
                            i2++;
                        }
                    } else if (amr.i(moxVar, new mox(double[].class))) {
                        double[] dArr = (double[]) value;
                        int length5 = dArr.length;
                        String str6 = cpo.a;
                        objArr = new Double[length5];
                        while (i2 < length5) {
                            objArr[i2] = Double.valueOf(dArr[i2]);
                            i2++;
                        }
                    } else {
                        throw new IllegalArgumentException("Key " + str + " has invalid type " + moxVar);
                    }
                    value = objArr;
                }
            }
            map2.put(str, value);
        }
    }

    public static final void l(String str, byte[] bArr, Map map) {
        bArr.getClass();
        map.put(str, cpo.a(bArr));
    }

    public static final void m(String str, Object obj, Map map) {
        map.put(str, obj);
    }
}
