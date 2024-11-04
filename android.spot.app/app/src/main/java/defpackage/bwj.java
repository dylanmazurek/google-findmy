package defpackage;

import android.database.Cursor;
import android.os.Build;
import android.view.ContentInfo;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwj {
    public static bur a(View view, bur burVar) {
        ContentInfo performReceiveContent;
        ContentInfo a = burVar.a();
        performReceiveContent = view.performReceiveContent(a);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == a) {
            return burVar;
        }
        return bur.b(performReceiveContent);
    }

    public static void b(View view, String[] strArr, bvk bvkVar) {
        if (bvkVar == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new bwk(bvkVar));
        }
    }

    public static String[] c(View view) {
        String[] receiveContentMimeTypes;
        receiveContentMimeTypes = view.getReceiveContentMimeTypes();
        return receiveContentMimeTypes;
    }

    public static final int d(Cursor cursor, String str) {
        String str2;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    columnNames.getClass();
                    String str3 = "." + str;
                    String str4 = "." + str + '`';
                    int i = 0;
                    int i2 = 0;
                    while (i2 < columnNames.length) {
                        String str5 = columnNames[i2];
                        int i3 = i + 1;
                        if (str5.length() >= str.length() + 2 && (moz.u(str5, str3) || (str5.charAt(0) == '`' && moz.u(str5, str4)))) {
                            columnIndex = i;
                            break;
                        }
                        i2++;
                        i = i3;
                    }
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            columnNames2.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i4 = 0;
            for (String str6 : columnNames2) {
                i4++;
                if (i4 > 1) {
                    sb.append((CharSequence) ", ");
                }
                amr.d(sb, str6, null);
            }
            sb.append((CharSequence) "");
            str2 = sb.toString();
        } catch (Exception unused) {
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}
